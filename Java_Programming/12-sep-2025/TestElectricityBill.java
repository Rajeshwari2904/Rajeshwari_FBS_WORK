class ElectricityBill
{
    int id, unit;
    String name;
    static double ratePerUnit;

    static{                       // Static block
          ratePerUnit= 10;
      }

   ElectricityBill(){            // Default Constructor
        this.id = 1;
        this.unit= 20;
        this.name= "Mrunmayee";
    }

   ElectricityBill(String name, int id, int unit){         // Parameterized Constructor
        this.id = id;
        this.unit= unit;
        this.name= name;
    }

   void setid(int id){
       this.id= id;
     }
   void setunit(int unit){
       this.unit= unit;
     }
    void setname(String name){
       this.name= name;
     }
     static void setratePerUnit(double d){     // Static Function
         ratePerUnit =d;
      }

    int getid(){
       return this.id;
     }
    int getunit(){
       return this.unit;
     }
    String getname(){
       return this.name;
     }

    void display(){
        System.out.println("Name: "+ this.name);
        System.out.println("ID: "+ this.id);
        System.out.println("Units: "+ this.unit);
        System.out.println("RatePerUnit: "+ this.ratePerUnit);
      }

   void  CalculateElectricityBill(){
                 System.out.println("Total Electricity Bill for "+this.name +": " + (this.unit * this.ratePerUnit));
   }
       

}


class TestElectricityBill
{
  public static void main(String[] args)
   {
     
      ElectricityBill EB= new ElectricityBill("Rutika", 12, 30);
      EB.display();

      System.out.println("");

      ElectricityBill EB1= new ElectricityBill("Rajeshwari", 13, 40);
      EB1.display();

      System.out.println("");

      ElectricityBill EB2= new ElectricityBill();
      EB2.display();
      System.out.println("");

      EB.CalculateElectricityBill();
      EB1.CalculateElectricityBill();
      EB2.CalculateElectricityBill();

      System.out.println("");

      ElectricityBill.setratePerUnit(50);

      System.out.println("After using Static method to change the Rate.");
      EB.display();
      EB1.display();

    }
}



     


   
 