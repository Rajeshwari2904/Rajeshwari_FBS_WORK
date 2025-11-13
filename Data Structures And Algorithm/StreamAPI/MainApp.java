package p1;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Student> allStudents = new ArrayList();
		allStudents.add(new Student(1, "Soham", 80, "M"));
		allStudents.add(new Student(2, "Pranav", 85, "M"));
		allStudents.add(new Student(3, "Geeta", 90, "F"));
		allStudents.add(new Student(4, "Priyanka", 95, "F"));
		
		//iteration
		//forEach()
		allStudents.stream().forEach(ref->System.out.println(ref.getName())); //function name dont know

		//filtering
		// allStudents.stream().filter(merimarzi->merimarzi.getMarks()>90).forEach(ref->System.out.println();));
	
	
	   //pipeline
		
	
	
	
	
	}
	
	
	

}
