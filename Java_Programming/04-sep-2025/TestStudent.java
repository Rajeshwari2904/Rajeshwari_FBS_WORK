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
 int getroll_no()
 {
    return this.roll_no;
 }

 int getmarks()
 {
    return this.marks;
 }
 String getname()
 {
    return this.name;
 }

 void display()
 {
   System.out.println("Name is: "+ this.name + " roll no is: " + this.roll_no +" marks: " + this.marks);
/* 
   System.out.println("Name is: "+ this.name);
   System.out.println("Roll No: "+ this.roll_no);
   System.out.println("Total Marks: "+ this.marks);
*/
 }

}

class TestStudent
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

     s1.display();
   }
}

