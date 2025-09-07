class employee
{
  int id;
  String name;
  double Salary;

  void setid(int s)
  {
    this.id= s;
  }
  void setname(String str)
  {
    this.name = str;
  }
  void setSalary( double d)

  {
    this.Salary= d;
  }
}

class setEmployee
{
   public static void main(String[] args)
    {
        employee e =new employee();
        e.setid(101);
        e.setname("Raj");
        e.setSalary(50000);

        System.out.println("ID: "+ e.id);
        System.out.println("Name: "+ e.name);
        System.out.println("Salary: "+ e.Salary);
    }
}

