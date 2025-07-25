package DayFive.practice;

public class StudentPractice extends PersonPractice {
	private int uid;
	private String courseName;
	
	public StudentPractice(int pid, String name, String city,int uid, String courseName) {
		super(pid, name, city);
		this.uid = uid;
		this.courseName = courseName;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "StudentPractice [id= "+super.getPid()+", name="+super.getName()+", city="+super.getCity()+", uid=" + uid + ", coursename=" + courseName + "]";
	}

}
