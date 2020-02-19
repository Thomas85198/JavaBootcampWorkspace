package tw.luchienlin.constructor;

public class Main {

	public static void main(String[] args) {

		
		
		// Account bobsAccount = new Account();
//		Account bobsAccount = new Account("12345", 0.00, "Thomas", "luchienlin@gmail.com", "(408) 366-1888");
//		Account bob = new Account();
//		
//		bobsAccount.withdrawal(100.0);
//		
//		bobsAccount.deposit(50.0);
//		bobsAccount.withdrawal(100.0);
//		
//		bobsAccount.deposit(51.0);
//		bobsAccount.withdrawal(100.0);
//		
//		Account timsAccount = new Account("Tim", "tim@gmail.com", "12345");
//		System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
		
		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());
		
		VipCustomer person2 = new VipCustomer("Bob",222222.22);
		System.out.println(person2.getName());
		
		VipCustomer person3 = new VipCustomer("TIm", 100.0, "TTT@GGGG");
		System.out.println(person3.getName());
		System.out.println(person3.getEmail());
		System.out.println(person3.getCreditLimit());
		
	}
}
