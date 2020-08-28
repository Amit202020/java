package set.com;

public class Student implements Comparable {

	private int rollNo;
	private String name;
	private int marks;

	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Object obj) {
		Student student = (Student) obj;
		if (marks == student.marks)
			return 0;
		else if (marks > student.marks)
			return 1;
		else
			return -1;
	}

}
