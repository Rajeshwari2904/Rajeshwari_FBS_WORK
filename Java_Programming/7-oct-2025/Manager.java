package p2;

public class Manager extends EmployeeDetails{

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
     
      int gettarget()
      {
            return  this.target;
      }

      
      double getincentive()
      {
           return this.incentive;
      }
     public String toString() {
    	 return super.toString()+ ", Incentive: "+ this.incentive + ", Target: "+ this.target;
     }
  
      public Manager()          // Default Constructor
      {
              super();
              this.target= 100;
              this.incentive= 10000;
         //     System.out.println("Default Constructor Called...");
       }

       public Manager(int id, String name, double salary, int target,  double incentive)      //Parameterized Constructor
       {
                super(id, name, salary);
                this.incentive= incentive;
                this.target= target;
             
        }
      

}
