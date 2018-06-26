package timetable;

import java.util.ArrayList;

/**
 *
 * @author brianbett
 */
public class Instructor {
    private String instructorName;
    private ArrayList<String> unitsTaught = new ArrayList();

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public ArrayList<String> getUnitTaught() {
        return unitsTaught;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setUnitTaught(ArrayList<String> unit) {
        this.unitsTaught = unit;
    }
    
}
