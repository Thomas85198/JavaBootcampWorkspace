package tw.luchienlin.java.normal;

public class Main {
	
	public static void main(String[] args) {
		
		// 2 bytes 16 bits memory
		// Unicode萬國碼
		// 如果要英文以外的就需要透過Unicode
		char myChar = 'D';
		
		// 萬國碼寫法反斜線u後面接四位數字
		char myUnicodeChar = '\u0044';
		System.out.println(myChar);
		System.out.println(myUnicodeChar);
		
		char myCopyrightChar = '\u00A9';
		System.out.println(myCopyrightChar);
		
		boolean myTrueBooleanValue = true;
		boolean myFalseBooleanValue = false;
		
		// 如果大於21的話...
		boolean isCustomerOverTwentyOne = true;
		
		
				
	}
}
