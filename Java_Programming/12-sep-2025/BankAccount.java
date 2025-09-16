import java.util.Scanner;

class Account
{
   String holderName;
   int account_no;
   double balance;
   static double interest_rate;

   static{
        interest_rate = 5;
     }

   static void setinterest_rate(double i){   // write static in setter and change variable name
          interest_rate = i;                 // remove "this" 
      }
   void setholderName(String holder ){
          this.holderName = holder;
      }
   void setaccount_no(int account){
          this.account_no= account;
      }
    void setbalance(double balance){
          this.balance = balance;
      }

    double getbranch(){
          return this.interest_rate;
      }
   String getholderName(){
         return this.holderName;
      }
   int getaccount_no(){
          return this.account_no;
      }
    double getbalance(){
          return this.balance;
      }
   
     Account(){
           this.holderName = "Rajeshwari";
           this.account_no= 101;
           this.balance = 500000;
      }


   
     Account(String holdername, int AccountNo, double balance){
          
     //this.interest_rate = interest_rate;
       this.holderName = holdername;
       this.account_no= AccountNo;
       this.balance = balance;
      }

      void display(){
          
          System.out.println("Holder_Name: "+ this.holderName);
          System.out.println("Account Number: "+ this.account_no);
          System.out.println("Balance: "+ this.balance);
          System.out.println("Interest_rate: "+ this.interest_rate);
      }
}

class BankAccount
{
  public static void main(String[] args){
       // Scanner sc = new Scanner(System.in);   
   
  /*     System.out.println("Enter Holder Name: ");
        String h= sc.nextLine();

        System.out.println("Enter Account Number: ");
        String a= sc.nextLine();
        System.out.println("Enter Balance: ");
        double b1= sc.nextDouble();
  
        System.out.println("Enter Interest Rate: ");
        double d= sc.nextDouble();  */

       
       Account ac= new Account("Nalbalwar", 1006, 19009);
       ac.display();
  
       System.out.println("");

       Account ac1= new Account( "Shree", 100, 2200);
       ac1.display();
       System.out.println("");

       Account.setinterest_rate(4.7);
       ac.display();
       ac1.display();
   
     }
}





    
   
  