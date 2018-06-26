package timetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RoomChart {
    StudentGroup group;
    private ArrayList<Unit> unit = new ArrayList<>();
    private ArrayList<Instructor> teacher = new ArrayList<>();
    private Tt timetable;
    private ArrayList<Lecture> classes = new ArrayList<>();
    private ArrayList<Combination> combinations = new ArrayList<>();
    

    /**
     * @param group the group to set
     */
    public void setGroup(StudentGroup group) {
        this.group = group;
    }

    /**
     * @return the group
     */
    public StudentGroup getGroup() {
        return group;
    }

    

    private void createLectures(ArrayList<Instructor> professors) {

        Iterator<Instructor> professorIterator = professors.iterator();
        while (professorIterator.hasNext()) {
            Instructor professor = professorIterator.next();
            ArrayList<String> unitsTaught = professor.getUnitTaught();
            Iterator<String> unitIterator = unitsTaught.iterator();
            while (unitIterator.hasNext()) {
                String units = unitIterator.next();
                classes.add(new Lecture(professor, units));
            }
        }
    }

    
    public void feedData(){
        ArrayList<ClassRoom> classroom = new ArrayList<>();
        
        ClassRoom room1 = new ClassRoom("ED15",false, "", 80);
        
        classroom.add(room1);
        
        teacher.add(new Instructor("Brian"));
        createLectures(teacher);
        
        this.timetable = new Tt(classroom, classes);
        
        unit.add(new Unit("COMP260", "SWE", 3, false));
        
        
        timetable.initializeTt();
        Algo ge = new Algo();

        ge.populationAccepter(timetable);
    }
    
    
   
    private void display() {
        int i = 1;
        System.out.println("displaying timetable.......");
        
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\nTime Table" );
            ArrayList<ClassRoom> allrooms = timetable.getRooms();
            Iterator<ClassRoom> allroomsIterator = allrooms.iterator();
            while (allroomsIterator.hasNext()) {
                ClassRoom room = allroomsIterator.next();
                System.out.println("Room: " + room.getRoomName());
                ArrayList<Day> weekdays = room.getWeek().getWeekDays();
                Iterator<Day> daysIterator = weekdays.iterator();
                
                while (daysIterator.hasNext()) {
                    Day day = daysIterator.next();
                    ArrayList<Slot> timeslots = day.getSlot();
                    Iterator<Slot> timeslotIterator = timeslots.iterator();
               
                    while (timeslotIterator.hasNext()) {
                        Slot lecture = (Slot) timeslotIterator.next();
                        
                        if (lecture.getLecture() != null) {
                            System.out.print("(" + lecture.getLecture().getUnit() + "#" + lecture.getLecture().getInstructor().getInstructorName() + "#" + lecture.getLecture().getStudentGroup().getName() + ")");
                        } else {
                            System.out.print("   free   ");
                        }
                    }
                    System.out.print("\n");
                }
                System.out.print("\n\n");
            }
            i++;
        
    }

    
}