package tw.luchienlin.java.whileloop;

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));



	}
	public static int getEvenDigitSum(int number) {
		// 計算number以下的所有偶數字和
		// 如果number為負，則return -1
		if(number < 0) {
			return -1;
		} else {
			int sum = 0;
			int temp = number;
			while(number != 0) {
				// 用個位數做判斷是否為偶數
				temp = number % 10;
				if(temp % 2 == 0) {
					sum += temp;
				}
				number = number / 10;
				if(number == 0) {
					break;
				}
			
			}
			return sum;
		}
	}
}
