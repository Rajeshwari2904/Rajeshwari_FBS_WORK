package list;

import java.util.*;

import p2.Admin;
import p2.EmployeeDetails;
import p2.Manager;

public class EmployeeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList employee = new LinkedList();
		
		employee.add(new EmployeeDetails(1, "Rajeshwari", 50000));
		
		employee.add(new Manager(101, "Raj", 34000, 20, 45000));
		
		employee.add(new Admin(112, "Rutuja", 3000, 8000));
		
		System.out.println(employee);

		
		

	}

}
