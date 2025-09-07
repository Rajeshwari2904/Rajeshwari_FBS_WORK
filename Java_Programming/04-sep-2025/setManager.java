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
}

class setManager
{
  public static void main(String[] args)
  {
     manager m1 = new manager();
     m1.setid(10);
     m1.setname("Rutika");
     m1.setsalary(45000);
     m1.setIncentive(5000);
     m1.settarget(60);

     System.out.println("ID: "+ m1.id);
     System.out.println("Name: "+ m1.name);
     System.out.println("Salary: "+ m1.salary);
     System.out.println("Incentive: "+ m1.incentive);
     System.out.println("Target: "+ m1.target);


  }
}  