package timetable;

public class Lecture{
	private String unit;
	private StudentGroup studentGroup;
	private Instructor ins;
	//represents one lecture having professor and subject
	
        public Lecture(Instructor ins, String unit){
            this.ins = ins;
            this.unit = unit;
        }
        
	Lecture(String unit){
		this.unit = unit;
	}

	public Instructor getInstructor() {
		return ins;
	}

	public void setInstructor(Instructor ins) {
		this.ins = ins;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String subject) {
		this.unit = subject;
	}

	public StudentGroup getStudentGroup() {
		return studentGroup;
	}

	public void setStudentGroup(StudentGroup studentGroup) {
		this.studentGroup = studentGroup;
	}
}
