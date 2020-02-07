package tw.luchienlin.java.whileloop;

public class DigitSumChallenge {

	public static void main(String[] args) {
		System.out.println("The sum of the digits in number 125 is " + sumDigits(125));

	}
	
	public static int sumDigits(int number) {
		if(number < 10) {
			return -1;
			
		} 
		
		int sum = 0;
			// 125 -> 125 / 10 = 12 * 10 --> 125 - 120 = 5 
			// 十位適用numbers/10去算
			// 百位
		while(number > 0) {
			// 最小的
			// extract the least-significant digit
			int digit = number % 10;
			sum += digit;
			
			// drop the least-significant digit
			number /= 10; // same as number = number / 10;
			
		}
		return sum;
	}

}
