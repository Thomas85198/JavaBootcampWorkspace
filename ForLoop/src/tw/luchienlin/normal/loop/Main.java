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
		for (int i = 8; i >= 2; i--) {
			System.out.println(
					"10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
}
