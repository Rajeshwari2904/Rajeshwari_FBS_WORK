class Calculator
{
  void add(int a, int b)
  {
    System.out.println("Addition is: "+ (a+b));
  }
   void add(int a, double d1)
  {
    System.out.println("Addition is: "+ (a+d1));
  }
   void add(double a, double b)
  {
    System.out.println("Addition is: "+ (a+b));
  }
   void add(double a, int b)
  {
    System.out.println("Addition is: "+ (a+b));
  }
}
  
class TestCalculator
{
  public static void main(String[] args)
  {
    Calculator C1= new Calculator();
    C1.add(10, 20);
    C1.add(10, 12.5);
    C1.add(13.8, 20.7);
    C1.add(25.3, 20);
  }
}
  
