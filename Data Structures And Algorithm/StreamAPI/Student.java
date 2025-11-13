package p1;

public class Student {
	
	int roll_no;
	String name;
	float marks;
	String gender;
	
	
	public Student() {
		super();
	}


	public Student(int roll_no, String name, float marks, String gender) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}


	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	

}
