package list;

import java.util.ArrayList;

import p2.*;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList employee = new ArrayList();
		
		employee.add(new EmployeeDetails(1, "Rajeshwari", 50000));
		//System.out.println(employee);
		
		employee.add(new Manager(101, "Raj", 34000, 20, 45000));
		
		employee.add(new Admin(112, "Rutuja", 3000, 8000));
		
		System.out.println(employee);
		
		
		

	}

}
