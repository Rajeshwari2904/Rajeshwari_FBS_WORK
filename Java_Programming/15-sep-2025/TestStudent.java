class Student
{
  int fbs_id;
  String s_name;
  double distance_travelled;
  static int student_count;

  static{                         // Static Function
     student_count= 0;
   }
   Student(){                      // Default Constructor
          this.fbs_id= 1;
          this.s_name= "Rajeshwari";
          this.distance_travelled= 4.5;
          student_count++; 
   }

   Student(int id, String name, double d){      // Parameterized Constructor
          this.fbs_id= id;
          this.s_name= name;
          this.distance_travelled= d;
          student_count++;
   }

   void setfbs_id(int id){                 // Setters
        this.fbs_id= id;
     }
    void sets_name(String name){
        this.s_name= name;
     }
    void setdistance(double distance){
        this.distance_travelled= distance;
     }
     

    int getfbs_id(){                        // Getters
        return this.fbs_id;
     }
    String gets_name(){
        return this.s_name;
     }
    double getdistance(){
        return this.distance_travelled;
     }
     static getcount(){
         return this.student_count;

    void display(){                                         //Display function
        System.out.println("Student ID : "+ this.fbs_id);
        System.out.println("Student Name : "+ this.s_name);
        System.out.println("Student Distance Travelled : "+ this.distance_travelled);
     // System.out.println("Student Count : "+ this.student_count);
    }
}

  
class TestStudent
{
  public static void main(String[] args){
       
         Student S1= new Student();
         S1.display();
        
         System.out.println("");
  	 Student S2= new Student(12, "Rutika", 6.7);
         S2.display();
         Student.getcount();

    }
}

