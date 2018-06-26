package timetable;

public class Slot {

    int duration;
    private Lecture lecture;

    public Lecture getLecture() {
        return lecture;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
