class date
{
 int day, month, year;
 String dow;
  
 void setday(int d)
  {
      this.day = d;
  }
 void setdow(String str)
  {
    this.dow = str;
  }
 void setmonth(int m)
 {
   this.month= m;
 }
 void setYear(int y)
  {
   this.year = y;
  }
 int getday()
 {
   return this.day;
 }

 int getmonth()
 {
    return this.month;
 }

 int getyear()
 {
   return this.year;
 }

 void display()
 {
    System.out.println(this.day +"/"+ this.month+ "/" + this.year);
 }


} 

class SetDate
{
  public static void main(String[] args)
    {
       date d1 = new date();
       date d2 = new date();
       d1.setday(26);
       d2.setday(10);
       d1.setdow("Thursday");
       d1.setmonth(8);
       d1.setYear(2003);

      
       System.out.println("Date: "+d1.day);
       System.out.println("Day of Week: " + d1.dow);
       System.out.println("Month: " + d1.month);
       System.out.println("Year: " + d1.year);    
  
/*
      if(d1.getday() > d2.getday())
       {
          System.out.println("d1 is Younger");
       }

      else
      {
          System.out.println("d2 is Younger");
      }
*/

        d1.display();


    }
}
  