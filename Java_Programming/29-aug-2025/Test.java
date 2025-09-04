class Date
{
  int day, month,year;
  String dow;
}

class Test
{
  public static void main(String[] args){
     Date d1= new Date();
     d1.dow = "Wednesday";
     System.out.println(d1.dow);
  }
}