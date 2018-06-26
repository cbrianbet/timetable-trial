package timetable;

public class Unit {

    String unitName;//Full unit Name ie Software Enginering
    String unitID;// Unit ID or Code ie COMP260
    int lecPerWeek;// The Number of LEctures per week
    boolean isPrac;

    Unit(String id, String name, int lectures, boolean lab) {
        this.unitID = id;
        this.unitName = name;
        this.lecPerWeek = lectures;
        this.isPrac = lab;
    }

    /**
     * @return the unitName
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @return the unitID
     */
    public String getUnitID() {
        return unitID;
    }

    /**
     * @return the lecPerWeek
     */
    public int getLecPerWeek() {
        return lecPerWeek;
    }

    /**
     * @return the isPrac
     */
    public boolean getIsPrac() {
        return this.isPrac;
    }

    /**
     * @param unitName the unitName to set
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * @param unitID the unitID to set
     */
    public void setUnitID(String unitID) {
        this.unitID = unitID;
    }

    /**
     * This is a setter for Lectures per week
     *
     * @param lecPerWeek the lecPerWeek to set
     */
    public void setLecPerWeek(int lecPerWeek) {
        this.lecPerWeek = lecPerWeek;
    }

    /**
     * @param isPrac the isPrac to set
     */
    public void setIsPrac(boolean isPrac) {
        this.isPrac = isPrac;
    }
}
