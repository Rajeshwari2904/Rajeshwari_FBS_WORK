class Printer
{
   void print(char c)
   {
     System.out.println(c);
   }
   void print(int a)
   {
     System.out.println(a);
   }
   void print(String s)
   {
     System.out.println(s);
   }
}
 
class TestPrinter
{
  public static void main(String[] args)
  {
    Printer P1= new Printer();
    P1.print('A');
    P1.print(101);
    P1.print("Hello");
  }
}

