package timetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Tt {

    private ArrayList<ClassRoom> rooms = new ArrayList<ClassRoom>();
    private ArrayList<Lecture> classes = new ArrayList<>();

    public Tt(ArrayList<ClassRoom> classroom, ArrayList<Lecture> lectures) {
        this.setRooms(classroom);
        this.setClasses(lectures);
    }

    
    /**
     * @return the classes
     */
    public ArrayList<Lecture> getClasses() {
        return classes;
    }

    /**
     * @param classes the classes to set
     */
    public void setClasses(ArrayList<Lecture> classes) {
        this.classes = classes;
    }

    /**
     * @return the rooms
     */
    public ArrayList<ClassRoom> getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(ArrayList<ClassRoom> rooms) {
        this.rooms = rooms;
    }

    private boolean isRoomOccupied(ClassRoom tempRoom, ArrayList<ClassRoom> rooms2) {

        for (ClassRoom room : rooms2) {
            if (room.equals(tempRoom)) {
                ArrayList<Day> weekdays = room.getWeek().getWeekDays();
                Iterator<Day> daysIterator = weekdays.iterator();

                while (daysIterator.hasNext()) {
                    Day day = daysIterator.next();
                    ArrayList<Slot> timeslots = day.getSlot();
                    Iterator<Slot> timeslotIterator = timeslots.iterator();

                    while (timeslotIterator.hasNext()) {
                        Slot lecture = timeslotIterator.next();

                        if (lecture.getLecture() == null) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private ClassRoom getBestRoom(int size, ArrayList<ClassRoom> rooms2) {
        int bigRoom = 500;// Size of the largest Room on Campus
        ClassRoom room = null;

        for (Iterator<ClassRoom> roomsIterator = rooms2.iterator(); roomsIterator.hasNext();) {
            ClassRoom tempRoom = roomsIterator.next();

            if (!isRoomOccupied(tempRoom, rooms2)) {
                int tmp = Math.abs(size - tempRoom.getCapacity());

                if (tmp < bigRoom) {
                    bigRoom = tmp;
                    room = tempRoom;
                }
            }
        }
        return room;
    }

    private void placeLecture(Lecture lecture, ArrayList<ClassRoom> rooms2) {
        int size = lecture.getStudentGroup().getSize();
        String dept = lecture.getStudentGroup().getDepartment();
        boolean invalid = true;
        ClassRoom room = null;
        Collections.shuffle(rooms2);

        while (invalid) {
            room = getBestRoom(size, rooms2);

            if (room.getDepartment().equalsIgnoreCase(dept)) {
                invalid = false;
                Collections.shuffle(rooms2);
            } else {
                Collections.shuffle(rooms2);
            }
        }

        ArrayList<Day> weekdays = room.getWeek().getWeekDays();
        Iterator<Day> daysIterator = weekdays.iterator();

        while (daysIterator.hasNext()) {
            Day day = daysIterator.next();
            ArrayList<Slot> timeslots = day.getSlot();
            Iterator<Slot> timeslotIterator = timeslots.iterator();

            while (timeslotIterator.hasNext()) {
                Slot lecture2 = timeslotIterator.next();

                if (lecture2.getLecture() == null) {
                    lecture2.setLecture(lecture);
                    return;
                }
            }
        }
        System.out.println("Placed");
    }

    public void setTimeTable(ArrayList<StudentGroup> studentGroups2, ArrayList<ClassRoom> rooms2) {
        Collections.shuffle(studentGroups2);

        Stack<Lecture> lecturesStack = new Stack<>();
        for (StudentGroup studentGrp : studentGroups2) {
            String unit = studentGrp.getSubjectName();
            int noOfLectures = studentGrp.getNoOfLecturePerWeek();
            for (int i = 0; i < noOfLectures; i++) {
                Collections.shuffle(classes);
                Iterator<Lecture> classIterator = classes.iterator();
                while (classIterator.hasNext()) {
                    Lecture lecture = classIterator.next();
                    if (lecture.getUnit().equalsIgnoreCase(unit)) {
                        Lecture mainLecture = new Lecture(lecture.getInstructor(), lecture.getUnit());
                        mainLecture.setStudentGroup(studentGrp);
                        lecturesStack.push(mainLecture);
                        break;
                    }
                }
            }
        }
    }
    
    /**
     *
     */
    public void initializeTt() {
        ArrayList<StudentGroup> studentGroup = new ArrayList<>();
    
        rooms.clear();
        setTimeTable(studentGroup, rooms);

    }

}
