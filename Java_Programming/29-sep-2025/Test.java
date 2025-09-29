
public class Test {

	public static void main(String[] args) {
		
		
		int a =10;
		int b =0;
	    int c;
	    
	    try {
	    	
	    	String fname = args[0];
	    	String lname = args[1];
	    	
	    	System.out.println("Name is "+ fname +" "+ lname);
	    	
	    	c  = a/b;
	    	System.out.println("Answer is "+ c);
	    	
	    }catch(ArithmeticException ae) {
	    	System.out.println("Please Don't Provide Second value as 0");
	    }
	    
	    catch(ArrayIndexOutOfBoundsException ar) {
	    	
	    	System.out.println("Please Provide atleast two arguments from console");
	    	
	    }
	    
	    catch(Exception e) {
	    	System.out.println("Some Problem Occured");
	    }
	    
	    

	}

}
