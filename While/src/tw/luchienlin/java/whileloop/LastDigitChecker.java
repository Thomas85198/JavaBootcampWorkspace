package tw.luchienlin.java.whileloop;

public class LastDigitChecker {

	public static void main(String[] args) {

		System.out.println(isValid(10));
		System.out.println(hasSameLastDigit(11, 21, 31));
	}

	// 10-1000包含，如果不是範圍內，則return false
	// 如果至少兩個數字最右邊是一樣的數字單位， true
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {

		if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
			return false;
		} else {
			// 用個位數看即可
			num1 = num1 % 10;
			num2 = num2 % 10;
			num3 = num3 % 10;
			if ((num1 == num2 && num1 == num3) || (num2 == num1 && num2 == num3) || (num3 == num1 && num3 == num2)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isValid(int num) {
		if (num < 10 || num > 1000) {
			return false;
		} else {
			return true;
		}
	}

}
