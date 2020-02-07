package tw.luchienlin.normal.loop;

public class Main {

	public static void main(String[] args) {
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
		System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
		System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
		System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

		for (int i = 0; i < 5; i++) {
			System.out.println("Loop " + i + " hello!");
		}

		// 限制只有小數兩位
		for (int i = 2; i < 9; i++) {
			System.out.println(
					"10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
		}
		
		System.out.println("******************************");

		// 限制只有小數兩位
		// 這邊是讓8%到2%
		for (int i = 8; i >= 2; i--) {
			System.out.println(
					"10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
		}
		
		int count = 0;
		for(int i=10; i<50; i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("Number " + i + " is a prime number");
				if(count == 10) {
					System.out.println("Existing for loop");
					break;
				}
			}
		}
		
		
		
	}
	
	// Create a for statement using any range of numbers
	// Determing if the number is prime number using the isPrime method
	// if it is a prime, print it out AND increment a count of the number of prime numbers found
	// if that count is 3 exit the for loop
	
	
	// 判斷是不是Prime number
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		// 計算平方根，不然就是i <= n/2
		for (int i=2; i<=(long)Math.sqrt(n); i++) {
			System.out.println("Lopping" + i);
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
}
