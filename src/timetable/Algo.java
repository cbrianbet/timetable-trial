package timetable;

import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.*;

public class Algo {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "kaka10139";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/ttproj";

    private static ArrayList<String> lectureTimings = new ArrayList<>();
    private static Tt timeTable;
    private static final ArrayList<String> weekDayNames = new ArrayList<>();

    public static void createLectureTime() {
        for (int i = 7; i < 19; i++) {
            lectureTimings.add(i + ":00" + " TO " + (i + 1) + ":00");
        }
    }
    
    public static void createWeek() {
        String[] weekDaysName = new DateFormatSymbols().getWeekdays();
        
        for (int i = 2; i < weekDaysName.length-1; i++) {
            System.out.println("weekday = " + weekDaysName[i]);
            
            if (!(i == Calendar.SUNDAY)||!(i == Calendar.SATURDAY)) {
                weekDayNames.add(weekDaysName[i]);
            }
        }
    }

    private static void display() {

        int i = 0, j = 0;
        ArrayList<ClassRoom> allrooms = timeTable.getRooms();
        Iterator<ClassRoom> allroomsIterator = allrooms.iterator();

        while (allroomsIterator.hasNext()) {
            ClassRoom room = allroomsIterator.next();
            System.out.println("\nRoom: " + room.getRoomName());
            ArrayList<Day> weekdays = room.getWeek().getWeekDays();
            Iterator<Day> daysIterator = weekdays.iterator();
            Iterator<String> lectTimeItr = lectureTimings.iterator();
            System.out.print("\nTimings:    ");

            while (lectTimeItr.hasNext()) {
                System.out.print(" " + lectTimeItr.next() + " ");
            }
            i = 0;
            System.out.print("\n");
            while (daysIterator.hasNext()) {
                Day day = daysIterator.next();
                System.out.print("Day: " + weekDayNames.get(i));
                ArrayList<Slot> timeslots = day.getSlot();

                for (int k = 0; k < timeslots.size(); k++) {

                    Slot lecture = timeslots.get(k);
                    if (lecture.getLecture() != null) {
                        System.out.print("  (" + lecture.getLecture().getUnit() + "#" + lecture.getLecture().getInstructor().getInstructorName() + "#" + lecture.getLecture().getStudentGroup().getName() + ")");
                    } else {
                        System.out.print(" FREE LECTURE ");
                    }
                }

                System.out.print("\n");
                i++;
            }

            System.out.print("\n");
        }

    }
    public static void populationAccepter(Tt timeTableCollection) {
        createWeek();
        createLectureTime();
    }

}
