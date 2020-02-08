package tw.luchienlin.java.whileloop;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindorme(1221));

	}

	
	public static boolean isPalindorme(int number) {
		
		int reverse = 0;
		int temp = number;
		while(temp != 0) {
			// 只要temp>0就...十位加個位
			/* number = 1221
			 * 1) reverse = 1, temp = 122;
			 * 2) reverse = 12, temp = 12;
			 * 3) reverse = 122, temp = 1;
			 * 4) reverse = 1221, temp = 0;
			 */
			// 結束
			reverse = (reverse * 10) + 
					(temp % 10);
			// 去掉小數點1位，這樣才能讓數字倒過來
			temp = temp / 10;
		}
		if(reverse == number) {
			return true;
		}
		return false;
	}
}
