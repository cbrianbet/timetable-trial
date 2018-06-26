package timetable;

public class ClassRoom {

    boolean disFriend;
    boolean boardChalk;
    int capacity;
    String roomName;
    boolean isLab;
    Week week;
    String department;

    public ClassRoom(String name, boolean islab, String dept, int capacity) {
        this.roomName = name;
        this.setWeek(new Week());
        this.isLab = islab;
        this.department = dept;
        this.capacity = capacity;
    }

    public boolean getDisFriend() {
        return this.disFriend;
    }

    public boolean getBoardChalk() {
        return this.boardChalk;
    }

    /**
     * @return capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public boolean getIsLab() {
        return this.isLab;
    }

    public Week getWeek() {
        return week;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    /**
     * @param isLab the isLab to set
     */
    public void setIsLab(boolean isLab) {
        this.isLab = isLab;
    }

    public void setDisFriend(boolean disFriend) {
        this.disFriend = disFriend;
    }

    public void setBoardChalk(boolean boardChalk) {
        this.boardChalk = boardChalk;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

}
