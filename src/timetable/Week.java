package timetable;

import java.text.DateFormatSymbols;
import java.util.ArrayList;

public class Week {

    private final String[] weekDaysName;
    private ArrayList<Day> weekDays = new ArrayList<>();

    
    public ArrayList<Day> getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(ArrayList<Day> weekDays) {
        this.weekDays = weekDays;
    }

    public Week() {
        this.weekDaysName = new DateFormatSymbols().getWeekdays();
        for (String weekDaysName1 : weekDaysName) {
            if (!(weekDaysName1.equals("SUNDAY"))) {
                if (!(weekDaysName1.equals("SATURDAY"))) {
                    Day newday = new Day(weekDaysName1);
                    weekDays.add(newday);
                }
            }
        }
    }
    
}
