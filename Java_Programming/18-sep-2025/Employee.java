
import java.util.Scanner;

class EmployeeDetails
{
  int id;
  String name;
  double salary;

      void setid(int s)
      {
           this.id= s;
      }
      void setname(String str)
      {
           this.name = str;
      }
      void setsalary( double d)
      {
           this.salary= d;
      }

      int getid()
      {
            return this.id;
      }

      String getname()
      {
            return this.name;
      }
      double getsalary()
      {
            return this.salary;
      }

      void display()
      {
              System.out.println("ID: "+ this.id);
              System.out.println("Name: "+ this.name);
              System.out.println("Salary: "+ this.salary);
      }
  
      EmployeeDetails()          // Default Constructor
      {
             this.id= 101;
             this.name= "Rutvik";
             this.salary= 50000;
             System.out.println("Default Constructor Called...");
      }

      EmployeeDetails(int t, String s, double d)          // Parameterized Constructor
       {
             this.id= t;
             this.name= s;
             this.salary= d;
             System.out.println("Parameterized Constructor Called...");
       }
}


class Manager extends EmployeeDetails
{
  int target;
  double incentive;

      
      void setIncentive( double d)
      {
            this.incentive = d;
      }

      void settarget( int target)
      { 
            this.target = target;
      }
     
      int target()
      {
            return  this.target;
      }

      
      double getincentive()
      {
           return this.incentive;
      }
      void display()
      {
            super.display();
            System.out.println("Incentive: "+ this.incentive);
            System.out.println("Target: "+ this.target);
      }
  
      Manager()          // Default Constructor
      {
              super();
              this.target= 100;
              this.incentive= 10000;
         //     System.out.println("Default Constructor Called...");
       }

       Manager(int id, String name, double salary, int target,  double incentive)      //Parameterized Constructor
       {
                super(id, name, salary);
                this.incentive= incentive;
                this.target= target;
             //   System.out.println("Parameterized Constructor Called...");
        }

} // manager class Ends here

class HR extends EmployeeDetails
{
	double commission;

	HR() {
		super();
		this.commission= 10000;
	}

	HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display() {
		super.display();
		System.out.println("Commision is: "+ this.commission);
	}
		
}

class Admin extends EmployeeDetails
{
	double allowance;
	
	Admin(int id, String name, double salary, double allowance){
		super(id, name, salary);
		this.allowance= allowance;
	}
	
	Admin(){
		super();
		this.allowance= 2300;
		
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display() {
		super.display();
		System.out.println("Allowance: "+ this.allowance);
		
	}
}

class AreaSalesManager extends Manager
{
	String areaName;

	AreaSalesManager() {
		super();
		this.areaName= "Accounts";
	}

	AreaSalesManager(int id, String name, double salary, int target,  double incentive, String areaName) {
		super(id, name, salary,target, incentive );
		this.areaName = areaName;
	}

	String getAreaName() {
		return areaName;
	}

	void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	void display() {
		super.display();
		System.out.println("Area Name: "+this.areaName);
	}
	
	
	
}



class Employee
{
   public static void main(String[] args)
    {
             
             EmployeeDetails e1 =new EmployeeDetails();
             e1.display();
             
             Manager M1 = new Manager(101, "Raj", 34000, 20, 45000);
             M1.display();
             
             HR hr1 = new HR(111, "Snaika", 50000, 60000);
             hr1.display();
             
             Admin adm= new Admin(112, "Rutuja", 3000, 8000);
             adm.display();
             
             AreaSalesManager asm =new AreaSalesManager(101, "Raj", 34000, 20, 45000, "Finance");
             asm.display();
    }
}


