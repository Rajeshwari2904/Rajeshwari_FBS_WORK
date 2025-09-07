class manager
{
  int id, target;
  String name;
  double salary, incentive;

  void setid(int d)
  {
     this.id = d;
  }

  void setname( String str)
  {
     this.name = str;
  }
 
  void setsalary(double s)
  {
     this.salary = s;
  }
 
  void setIncentive( double d)
  {
    this.incentive = d;
  }

  void settarget( int target)
  { 
    this.target = target;
  }
  int getid()
  {
     return this.id;
  }

  int target()
  {
     return  this.target;
  }

  String getname()
  {
    return this.name;
  }
  double getsalary()
  {
     return this.salary;
  }
  double getincentive()
  {
     return this.incentive;
  }
 void display()
  {
    System.out.println("ID: "+ this.id);
    System.out.println("Name: "+ this.name);
     System.out.println("Salary: "+ this.salary);
     System.out.println("Incentive: "+ this.incentive);
     System.out.println("Target: "+ this.target);
  }

} // main Ends here

class TestManager
{
  public static void main(String[] args)
  {
     manager m1 = new manager();
     m1.setid(10);
     m1.setname("Rutika");
     m1.setsalary(45000);
     m1.setIncentive(5000);
     m1.settarget(60);

    m1.display();

/*
     System.out.println("ID: "+ m1.id);
     System.out.println("Name: "+ m1.name);
     System.out.println("Salary: "+ m1.salary);
     System.out.println("Incentive: "+ m1.incentive);
     System.out.println("Target: "+ m1.target);
*/

  }
}  