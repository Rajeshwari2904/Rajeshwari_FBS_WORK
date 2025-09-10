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
  void subtract(int a, int b)
  {
   System.out.println("Substraction is: "+ (a-b));
  }
   void subtract(int a, double d1)
  {
    System.out.println("Substraction is: "+ (a-d1));
  }
   void subtract(double a, double b)
  {
    System.out.println("Substraction is: "+ (a-b));
  }
   void subtract(double a, int b)
  {
    System.out.println("Substraction is: "+ (a-b));
  }

  void multiply(int a, int b)
  {
    System.out.println("Multiplication is: "+ (a*b));
  }
   void multiply(int a, double d1)
  {
    System.out.println("Multiplication is: "+ (a*d1));
  }
   void multiply(double a, double b)
  {
    System.out.println("Multiplication is: "+ (a*b));
  }
   void multiply(double a, int b)
  {
    System.out.println("Multiplication is: "+ (a*b));
  }

  void divide(int a, int b)
  {
    System.out.println("division is: "+ (a/b));
  }
   void divide(int a, double d1)
  {
    System.out.println("division is: "+ (a/d1));
  }
   void divide(double a, double b)
  {
    System.out.println("division is: "+ (a/b));
  }
   void divide(double a, int b)
  {
    System.out.println("division is: "+ (a/b));
  }


    
}
  
class TestCalculatorOp
{
  public static void main(String[] args)
  {
    Calculator C1= new Calculator();
    C1.add(10, 20);
    C1.add(10, 12.5);
    C1.add(13.8, 20.7);
    C1.add(25.3, 20);
 
    System.out.println("");
    C1.subtract(20, 10);
    C1.subtract(18, 12.5);
    C1.subtract(28.8, 20.7);
    C1.subtract(25.3, 20);

    System.out.println("");
    C1.multiply(1, 2);
    C1.multiply(10, 12.5);
    C1.multiply(13.8, 20.7);
    C1.multiply(25.3, 20);

    System.out.println("");
    C1.divide(10, 2);
    C1.divide(50, 12.5);
    C1.divide(30.8, 20.7);
    C1.divide(25.3, 20);

  }
}
  
