package p2;

public class EmployeeDetails
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

//      public void display()
//      {
//              System.out.println("ID: "+ this.id);
//              System.out.println("Name: "+ this.name);
//              System.out.println("Salary: "+ this.salary);
//             
//      }
//      
      public String toString()
      {
  
    	  return "ID: "+ this.id+ ", Name: "+ this.name+ ", Salary: "+ this.salary;
      }
  
      EmployeeDetails()          // Default Constructor
      {
             this.id= 101;
             this.name= "Rutvik";
             this.salary= 50000;
             
      }

      public EmployeeDetails(int t, String s, double d)          // Parameterized Constructor
       {
             this.id= t;
             this.name= s;
             this.salary= d;
       }
      
}


//class Manager extends EmployeeDetails
//{
//  int target;
//  double incentive;
//
//      
//      void setIncentive( double d)
//      {
//            this.incentive = d;
//      }
//
//      void settarget( int target)
//      { 
//            this.target = target;
//      }
//     
//      int gettarget()
//      {
//            return  this.target;
//      }
//
//      
//      double getincentive()
//      {
//           return this.incentive;
//      }
//     public String toString() {
//    	 return super.toString()+ ", Incentive: "+ this.incentive + ", Target: "+ this.target;
//     }
//  
//      public Manager()          // Default Constructor
//      {
//              super();
//              this.target= 100;
//              this.incentive= 10000;
//         //     System.out.println("Default Constructor Called...");
//       }
//
//       public Manager(int id, String name, double salary, int target,  double incentive)      //Parameterized Constructor
//       {
//                super(id, name, salary);
//                this.incentive= incentive;
//                this.target= target;
//             
//        }
//      
//
//} // manager class Ends here
//
//class HR extends EmployeeDetails
//{
//	double commission;
//
//	HR() {
//		super();
//		this.commission= 10000;
//	}
//
//	HR(int id, String name, double salary, double commission) {
//		super(id, name, salary);
//		this.commission = commission;
//	}
//
//	double getCommission() {
//		return commission;
//	}
//
//	void setCommission(double commission) {
//		this.commission = commission;
//	}
//	
//	public String toString() {
//		return super.toString()+ ", Commission: "+ this.commission;
//	}
//		
//	
//}
//
//class Admin extends EmployeeDetails
//{
//	double allowance;
//	
//	Admin(int id, String name, double salary, double allowance){
//		super(id, name, salary);
//		this.allowance= allowance;
//	}
//	
//	Admin(){
//		super();
//		this.allowance= 2300;
//		
//	}
//
//	double getAllowance() {
//		return allowance;
//	}
//
//	void setAllowance(double allowance) {
//		this.allowance = allowance;
//	}
//	
//	
//	public String toString() {
//	    return super.toString() + ", Allowance: " + this.allowance;
//	}
//}
//
//class AreaSalesManager extends Manager
//{
//	String areaName;
//
//	AreaSalesManager() {
//		super();
//		this.areaName= "Accounts";
//	}
//
//	AreaSalesManager(int id, String name, double salary, int target,  double incentive, String areaName) {
//		super(id, name, salary,target, incentive );
//		this.areaName = areaName;
//	}
//
//	String getAreaName() {
//		return areaName;
//	}
//
//	void setAreaName(String areaName) {
//		this.areaName = areaName;
//	}
//
//	
//	public String toString() {
//	    return super.toString() + ", Area Name: " + this.areaName;
//	}
//	
//}



//class Employee
//{
//   public static void main(String[] args)
//    {
//             
//             EmployeeDetails e1 =new EmployeeDetails();
//             e1.display();
//             
//             System.out.println();
//             
//             e1 = new Manager(101, "Raj", 34000, 20, 45000);   // Upcasting
//             e1.display();
//             e1.CalculateSalary();
//             
//             System.out.println();
//             
//             e1 = new HR(111, "Snaika", 50000, 60000);        // Upcasting
//             e1.display();
//             e1.CalculateSalary();
//             
//             System.out.println();
//             
//             e1= new Admin(112, "Rutuja", 3000, 8000);         // Upcasting
//             e1.display();
//             e1.CalculateSalary();
//             
//             System.out.println();
//             
//             e1 =new AreaSalesManager(101, "Raj", 34000, 20, 45000, "Finance");    // Upcasting
//             e1.display(); 
//             e1.CalculateSalary();
//    }
//}
//
//
//
//public class main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
