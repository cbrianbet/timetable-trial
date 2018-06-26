package timetable;

public class StudentGroup {
	
	private String name;
	private int noOfLecturePerWeek;//To be set by CFs
	private int size;
	private String subjectName;
	private boolean isPractical;
	private String department;

	public StudentGroup(String string, int numberOfLectures, int i, String subject, boolean lab, String dept) {
		
		this.setName(string);
		this.setNoOfLecturePerWeek(numberOfLectures);
		this.setSize(i);
		this.subjectName=subject;
		this.isPractical=lab;
		this.setDepartment(dept);
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNoOfLecturePerWeek() {
		return noOfLecturePerWeek;
	}

	public void setNoOfLecturePerWeek(int noOfLecturePerWeek) {
		this.noOfLecturePerWeek = noOfLecturePerWeek;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public boolean isPractical() {
		return isPractical;
	}

	public void setPractical(boolean isPractical) {
		this.isPractical = isPractical;
	}

	public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
