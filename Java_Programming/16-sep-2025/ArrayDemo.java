class Employee
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
  
      Employee()          // Default Constructor
      {
             this.id= 101;
             this.name= "Rutvik";
             this.salary= 50000;
             System.out.println("Default Constructor Called...");
      }

       Employee(int t, String s, double d)          // Parameterized Constructor
       {
             this.id= t;
             this.name= s;
             this.salary= d;
             System.out.println("Parameterized Constructor Called...");
       }

     void display()
      {
              System.out.println("ID: "+ this.id);
              System.out.println("Name: "+ this.name);
              System.out.println("Salary: "+ this.salary);
      }
}




class ArrayDemo
{
  public static void main(String[] args)
   {
       int[] arr;
       arr = new int[5];
       for(int i=0; i<arr.length; i++)
        {
          System.out.println(arr[i]);
    //    arr[2] = 5;
        }

       Employee[] brr = new Employee[5];
       // Array of references
       //which has null at all the array locations

       for(int i =0; i<brr.length; i++)
       System.out.println(brr[i]);
       // this gives NullPointerException


       // What should we do >>
       brr[0]= new Employee();  //default
       brr[1] = new Employee(101, "merry", 2000 ); // Parameterized
       brr[2] = new Employee(102, "cherry", 2000 );
       brr[3] = new Employee(103, "mini", 2000 );
       brr[4] = new Employee(104, "michki", 2000 );
       }
}
