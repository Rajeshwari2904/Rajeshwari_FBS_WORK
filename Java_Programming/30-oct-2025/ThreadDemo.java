class Worker extends Thread{
	
	public void run() {
		
       String numbers = "1234567890987654321436";
		
		for(int i = 0; i< numbers.length(); i++)
		{
			System.out.println(" "+numbers.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Worker W1 = new Worker();
		W1.start();
		
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i< alphabets.length(); i++)
		{
			System.out.println(" "+alphabets.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
