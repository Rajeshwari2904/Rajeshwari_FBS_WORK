package p2;

public class Admin extends EmployeeDetails{

	double allowance;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	public Admin(int id, String name, double salary,double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}
	

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" \nCommission:"+this.allowance;
	}

}

