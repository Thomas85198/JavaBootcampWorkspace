package tw.luchienlin.java.whileloop;

public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
	}
	public static int sumFirstAndLastDigit(int number) {
		// 如果number是負的直接return -1
		// 目的要找第一位與最後一位數之和
		int lastDigit = number % 10;
		int testNumber = 0;
		// 如果是個位數的話...
		// 就代表兩倍
		if(number > 0 && number < 10) {
			return number * 2;
		}
		if(number < 0) {
			return -1;
		}
		// 只要上面沒篩掉就...
		while(number > 0) {
			// 進一位
			number = number / 10;
			// 如果到第一個數以前，就會==0
			if(number == 0) {
				break;
			}
			testNumber = number;
		}
		return lastDigit + testNumber;
	}

}
