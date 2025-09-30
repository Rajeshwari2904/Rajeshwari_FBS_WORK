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
	
	public void  validate() {
		try {
			if(age < 18) {
				throw new VoterAgeException();
			}
			
			else {
				System.out.println("Yes you can Vote....");
			}
		}catch(VoterAgeException ve) {
			System.out.println(ve);
		}
	}
}
public class TestException {

	public static void main(String[] args) {
		
		Voter v = new Voter(17);
		v.validate();
		
	}

}
