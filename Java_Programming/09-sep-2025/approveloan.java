class Student
{
  int rollno;
  double percentage;
  String name;
  
  Student(int roll, double percent, String name)
  {
     this.rollno = roll;
     this.percentage= percent;
     this.name = name;
  }
/*  void setrollno(int roll)
  {
     this.rollno= roll;
  }
  void setpercent(double per)
  {
      this.percentage= per;
  }
  void setname(String name)
  {
      this.name= name;
  }
  int getrollno()
  {
    return this.rollno;
  }
  double getpercent()
  {
     return this.percentage;
  }
  String getname()
  {
      return this.name;
  }
*/

}

class Employee
{
  int id;
  double annualSalary;
  String name;
  
  Employee(int id, double annualSalary, String name)
  {
     this.id = id;
     this.annualSalary= annualSalary;
     this.name = name;
  }
/*  void setid(int id)
  {
     this.id= id;
  }
  void setannualSalary(double annualSalary)
  {
      this.annualSalary= annualSalary;
  }
  void setname(String name)
  {
      this.name= name;
  }
  int getid()
  {
    return this.id;
  }
  double getannualSalary()
  {
     return this.annualSalary;
  }
  String getname()
  {
      return this.name;
  }
*/

}

class Bank
{
  void approveloan(Student s)
  {
         System.out.println("Loan Approved for "+ s.name + " Roll no."+ s.rollno);

        if(s.percentage > 80)
        {
             System.out.println("Amount: 2 Lakh");
        }
        else if(s.percentage > 60 && s.percentage < 80)
        {
             System.out.println("Amount: 1 Lakh");
        }
        else if(s.percentage > 40 && s.percentage < 60)
        {
             System.out.println("Amount: 50K");
        }
        else
        {
            System.out.println("No Loan Approved");
        }
  }

   void approveloan(Employee e)
   {
          System.out.println("Loan Approved for "+ e.name + " ID: "+ e.id);

      if(e.annualSalary > 1200000) 
      {
            System.out.println("Amount: 1 Lakh");
      }
      else if(e.annualSalary > 1000000 && e.annualSalary < 1200000)
      {
           System.out.println("Amount: 7 Lakh");
      }
      else if(e.annualSalary > 600000 && e.annualSalary < 1000000)
      {
           System.out.println("Amount: 5 Lakh");
      }
      else if(e.annualSalary > 400000 && e.annualSalary < 600000)
      {
           System.out.println("Amount: 4 Lakh");
      }

      else
      {
           System.out.println("No Loan Approved");
      }
    }
}

class Approveloan
{
 public static void main(String[] args)
  {
    Bank B1= new Bank();
    Student S1= new Student(10,70, "Shri");  //  
    
    Employee E1= new Employee(101, 1100000, "Rajeshwari");   // 
    
   
   B1.approveloan(S1);
   B1.approveloan(E1);
  }
}















  