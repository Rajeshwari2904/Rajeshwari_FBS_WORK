class Time
{
   int hr, min, sec;

   Time(){
      this.hr= 2;
      this.min=0;
      this.sec=0;
   }
   
   Time(int h, int m, int s){
         this.hr= h;
         this.min=m;
         this.sec=s;
   }

   void sethr(int h){
        this.hr= h;
   }
   void setmin(int m){
        this.min= m;
   }
   void setsec(int s){
        this.sec= s;
   }

   int gethr(){
        return this.hr;
   }
   int getmin(){
        return this.min;
   }
   int getsec(){
        return this.sec;
   }

  void display(){
         System.out.println("Time: "+ this.hr+ ":" + this.min+ ":"+ this.sec );
    }
  
   void add(Time t1, Time t2){
       System.out.println("Total Time");
       int total_hr= t1.gethr() + t2.gethr();
       int total_min = t1.getmin() + t2.getmin();
       int total_sec = t1.getsec() + t2.getsec();
       System.out.println("Total_Hour: "+ total_hr + " Total_Minute: "+ total_min +" Total_Seconds:"+ total_sec);
       
   }
}

class TestTime
{
   public static void main(String[] args){
         
         Time T1 = new Time(2, 45, 20);
         T1.display();
         Time T2 = new Time(1, 10, 10);
         T2.display();

         T1.add(T1,T2);
         
    }
}
        

   


   