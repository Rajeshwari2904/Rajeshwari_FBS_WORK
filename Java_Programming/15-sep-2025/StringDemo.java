class StringDemo
{
   public static void main(String[] args){


       String str1= "Hello";
       String str2 = new String("Hello");
       String str3 = "Hello";
       str3[2]= 'a';
        
       System.out.println(str1 == str3);      // True
       System.out.println(str1 == str2);      // false

       System.out.println(str1.equals (str2));   // True
      // System.out.println(str3);
    } 
}     