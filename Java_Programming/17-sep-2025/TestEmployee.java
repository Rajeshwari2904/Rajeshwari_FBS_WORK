class Employee{
	int id;
	String empName;
	double salary;
	
	Employee() {     // default Constructor
		this.id= 101;
		this.empName= "Rajeshwari";
		this.salary= 20000;
	}

	Employee(int id, String emp_name, double salary) {  // Parameterized Constructor
		this.id = id;
		this.empName = emp_name;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getEmpName() {
		return empName;
	}

	void setEmpName(String emp_name) {
		this.empName = emp_name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+ this.empName);
		System.out.println("Salary: "+this.salary);
	}
		
}

class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.display();

	}

	

}
