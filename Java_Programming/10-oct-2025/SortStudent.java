package p1;

import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	int roll_no;
	double marks;
	String name;
	
	public Student() {
		
		this.roll_no = 10;
		this.marks = 60;
		this.name = "Shree";
	}
	public Student(int roll_no, double marks, String name) {
		
		this.roll_no = roll_no;
		this.marks = marks;
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	
}

public class SortStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> student= new ArrayList<Student>();
		int choice=0;
		
		do {
			System.out.println("*******Student Menu********");
			System.out.println("1. Add Student");
			System.out.println("2. Display Student");
			System.out.println("3. Sort by Roll no");
			System.out.println("4. Sort by Marks");
			System.out.println("5. Exit");
			choice  = sc.nextInt();
			
			
			switch(choice){
				case 1:
					System.out.println("Enter roll No: ");
					int roll = sc.nextInt();
					System.out.println("Enter Marks: ");
					double marks = sc.nextDouble();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					
				    student.add(new Student(roll_no, marks, name));
					System.out.println("Student Added Successfully");
					
				case 2:
					System.out.println("Student List---->");
					
			}
		}while()
		
	}

}
