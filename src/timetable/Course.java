package timetable;

import java.util.ArrayList;

public class Course{
    String courseName;
    String courseID;
    ArrayList<Unit> unitsTaught = new ArrayList<Unit>();

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @return the courseID
     */
    public String getCourseID() {
        return courseID;
    }

    /**
     * @return the unitsTaught
     */
    public ArrayList<Unit> getUnitsTaught() {
        return unitsTaught;
    }
    
    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    /**
     * @param courseID the courseID to set
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    /**
     * @param unitsTaught the unitsTaught to set
     */
    public void setUnitsTaught(ArrayList<Unit> unitsTaught) {
        this.unitsTaught = unitsTaught;
    }

    void createCombination(String unit, int size){

    }

    void createStudentGroup(){

    }
    
}