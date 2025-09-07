class Info
{
  int id;
  String name;
  double salary;
  double commission;

  void setid(int d)
  {
    this.id= d;
  }
  void setname(String name)
  {
     this.name = name;
  }
   void setsalary(double salary)
  {
     this.salary = salary;
  }
  void setcommission(double c)
  {
     this.commission = c;
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
  double getcommission()
  {
      return this.commission;
  }

  void display()
  {
    System.out.println("ID: "+ this.id);
    System.out.println("Name: "+ this.name);
    System.out.println("Salary: "+ this.salary);
    System.out.println("Commission: "+ this.commission);
  }
}

class TestHR
{
   public static void main(String[] args)
   {
     Info f = new Info();
     f.setid(10);
     f.setname("Devshree");
     f.setsalary(65000);
     f.setcommission(10000);

     f.display();

   }
}

