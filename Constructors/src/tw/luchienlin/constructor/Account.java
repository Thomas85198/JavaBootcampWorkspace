package tw.luchienlin.constructor;

public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	// 建構子
	public Account() {
		// 呼叫另一個建構子
		this("56789", 2.50, "Default name", "Default address", "default phone");
		System.out.println("Empty constructor called");
	}
	
	public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		// 建構子呼叫必須是第一個
		// 透過上一個呼叫並設定預設值
		this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(balance - withdrawalAmount <= 0) {
			System.out.println("Only " + balance + " avalable. Withdrawal not processed");
		} else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String Number) {
		this.number = Number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
}
