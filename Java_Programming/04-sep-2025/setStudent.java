class student
{
  int roll_no, marks;
  String name;
  
 void setroll_no( int roll)
 {
    this.roll_no= roll;
 }

 void setmarks ( int marks)
 {
    this.marks= marks;
 }
 void setname(String name)
 {
    this.name= name;
 }
}

class setStudent
{
   public static void main(String[] args)
   {
     student s1 = new student();
     s1.setroll_no(35);
     s1.setmarks(90);
     s1.setname("Rajeshwari");
     System.out.println("Name: "+ s1.name);
     System.out.println("Roll No: "+ s1.roll_no);
     System.out.println("Marks: "+ s1.marks);
   }
}

