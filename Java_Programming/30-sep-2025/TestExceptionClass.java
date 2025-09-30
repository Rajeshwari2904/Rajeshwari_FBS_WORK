package p1;


class VoterAgeException extends Exception{
	
	public String toString() {
		
		return "Invalid Age!!";
		
	}
}

class Voter{
	int age;
	
	public Voter(int age) {
		 
		this.age = age;
		
		}
	
	public void  validate() throws VoterAgeException
	{
			if(age < 18) {
				throw new VoterAgeException();
			}
			
			else {
				System.out.println("Yes you can Vote....");
			}
		
	}
}
public class TestExceptionClass {

	public static void main(String[] args) {
		
		Voter v = new Voter(24);
		
		try {
			
			v.validate();
			
		}catch(VoterAgeException ve)
		{
			System.out.println(ve);
		}
		finally {
			
			System.out.println("Finally always works with or without Exception");
		}	
		
	}

}
