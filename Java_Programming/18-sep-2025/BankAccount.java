
class BankAccount {
	
	String accountHolderName;
	int accountNumber;
	double balance;
	
	BankAccount() {
		super();
		this.accountHolderName= "Ishwari";
		this.accountNumber= 101;
		this.balance= 50000;
	}

	BankAccount(String accountHolderName, int accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	String getAccountHolderName() {
		return accountHolderName;
	}

	void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	int getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}
	
	void display() {
		System.out.println("Holder Name: "+ this.accountHolderName);
		System.out.println("Account Number: "+ this.accountNumber);
		System.out.println("Account Balance: "+ this.balance);
	}
	
}

class SavingAccount extends BankAccount{
	
	double interestRate;

	SavingAccount() {
		super();
		this.interestRate = 2000;
		
	}

	SavingAccount(String accountHolderName, int accountNumber, double balance, double interestRate) {
		super(accountHolderName, accountNumber, balance);
		this.interestRate = interestRate;
	}

	double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	void display() {
		super.display();
		System.out.println("Interest rate: "+ this.interestRate);
	}
		

}

class CurrentAccount extends BankAccount{
	
	double transactionLimit;

	CurrentAccount() {
		super();
		this.transactionLimit = 200000;
	}

	CurrentAccount(String accountHolderName, int accountNumber, double balance, double transactionLimit) {
		super(accountHolderName, accountNumber, balance);
		this.transactionLimit = transactionLimit;
	}

	double getTransactionLimit() {
		return transactionLimit;
	}

	void setTransactionLimit(double transactionLimit) {
		this.transactionLimit = transactionLimit;
	}
	
	void display() {
		super.display();
		System.out.println("Transaction Limit: "+ this.transactionLimit);
		
	}
	
}

class BankAccountMain
{
	public static void main(String[] args) {
		
		BankAccount B1= new BankAccount();
		B1.display();
		
		System.out.println();
		
		SavingAccount S1 = new SavingAccount("Akanksha", 102, 60000, 5000);
		S1.display();
		
		System.out.println();
		
		CurrentAccount C1 = new CurrentAccount("Mansi", 103, 70000, 300000);
		C1.display();
		
	}
}