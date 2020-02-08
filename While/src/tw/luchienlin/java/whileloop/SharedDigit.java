package tw.luchienlin.java.whileloop;

public class SharedDigit {

	public static void main(String[] args) {
		
	}
	public static boolean hasShareDigit(int num1, int num2) {
		if(num1<10||num1>99||num2<10||num2>99) {
			return false;
		}else {
			// 由於他只有兩位數
			// 所以只要算到十位數與個位數
			// 不用while
			int fDNum1 = num1 / 10;
			int lDNum1 = num1 % 10;
			int fDNum2 = num2 / 10;
			int lDNum2 = num2 % 10;
			if(fDNum1 == fDNum2 || fDNum1 == lDNum2 || lDNum1 == fDNum2 || lDNum1 == lDNum2) {
				return true;
			}else {
				return false;
			}
		}
	}
	
}
