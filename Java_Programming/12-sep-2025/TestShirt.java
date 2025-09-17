class Shirt
{
 int sid;
 String brand, type, size;
 static double price;   

 static{
       price = 1000;
  }
 Shirt(){
      this.sid= 1;
      this.brand= "CottonKing";
      this.type= "formal";
      this.size= "small";
   }
  Shirt(int id, String brand, String type, String size ){
      this.sid= id;
      this.brand= brand;
      this.type= type;
      this.size= size;
   }

  void setid(int id){
         this.sid= id;
    }
  void setbrand(String brand){
         this.brand= brand;
    }
   void settype(String type){
         this.type= type;
    }
    void setsize(String size){
         this.size= size;
    }
   static void setprice(double p){           // write static in setter and change variable name
         price = p;                          // remove "this"
    }

   int getid(){
         return this.sid;
    }
   String getbrand(){
         return this.brand;
    }
   String gettype(){
         return this.type;
    }
   String getsize(){
         return this.size;
    }

   void display(){
        System.out.println("Shirt ID: "+ this.sid);
        System.out.println("Shirt Brand: "+ this.brand);
        System.out.println("Shirt Type: "+ this.type);
        System.out.println("Shirt Size: "+ this.size);
        System.out.println("Shirt Base Price: "+ this.price);
   }

   void TotalPrice(){
          if(this.size == "medium"){
                double totalPrice = price + (price * 0.10);
                 System.out.println("Shirt Total Price: "+ totalPrice);
           }
           else if(this.size == "large"){
                 double totalPrice = price + (price * 0.20);
                 System.out.println("Shirt Total Price: "+ totalPrice);
           }
           else if(this.size == "x-large"){
                 double totalPrice = price + (price * 0.30);
                 System.out.println("Shirt Total Price: "+ totalPrice);
           }
     }

}

class TestShirt
{
 public static void main(String args[])
  {
     Shirt S = new Shirt();
     S.display();
     System.out.println("");

     Shirt S1 = new Shirt(2, "peterEngland", "casual", "medium");
     S1.display();
     S1.TotalPrice();
     System.out.println("");


     Shirt S2 = new Shirt(3, "H&M", "casual", "large");
     S2.display();
     S2.TotalPrice();

     System.out.println("");

     System.out.println("After set price using class name");
     System.out.println("");
    
    Shirt.setprice(500);
    S1.display();
    S1.TotalPrice();


  }
}

 
       
          

         
       

















     
