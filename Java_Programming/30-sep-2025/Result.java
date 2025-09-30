package p1;


class invalidMarksException extends Exception{
	
         public String toString() {
		
		   return "Please Enter Valid Marks";
		}
}

class Marks{
	
	int marks;
	
	public Marks(int marks) {
		
		this.marks = marks;
	}
	
	public void checkResult() {
	try {
		
		if(marks <=0 ) {
			throw new invalidMarksException();
		}
		else if(marks < 35) {
			System.out.println("Result is Fail");
		}
		
		else if(marks >=35 && marks <=49) {
			System.out.println("Result is Pass");
		}
		
		else if(marks >=50 && marks <=75) {
			System.out.println("Result is First Class");
		}
		
		else{
			System.out.println("Result is First Class with Distinction");
		}
	  }catch(invalidMarksException me) {
		
		System.out.println(me);
	 }
	
	 finally {
		
		 System.out.println("Keep it up..");
	 }
	
	}
}


public class Result {

	public static void main(String[] args) {
		
		Marks M1 = new Marks(0);
		
		M1.checkResult();
		

	}

}
