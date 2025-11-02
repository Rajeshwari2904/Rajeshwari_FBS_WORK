package p1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DemoStudents d1 = new DemoStudents();
//		d1.Payonline();
//		
//		OnlineStudents o1 = new OnlineStudents();
//		o1.Payonline();

		payFees[] student = {
				    new OnlineStudents(),
				    new DemoStudents(),
				    new OfflineStudents()
		};
		
		for(payFees ref: student) {
			
			ref.payOffline();
		}
	}

}
