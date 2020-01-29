package tw.luchienlin.java.normal;
public class Hello {
	
	// public 是類別存取的修飾字，可以准許我們存取Java code在裡面
	// void 即代表此方法不會回傳任何東西
	public static void main(String[] args) {
		
		
		System.out.println("Hello Thomas");
	
		// Declaration Statement 宣告
		// Expression 表達單值的構造		
		int myFirstNumber = (10 + 5) + (2 * 10);
		
		int mySecondNumber = 12;
		int myThirdNumber = myFirstNumber * 2;
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		int myLastOne = 1000 - myTotal;
		
		// String Literal 雙引號刮著的字串，不像變數可以改變
		System.out.println(myTotal);
		System.out.println(myLastOne);
	}
}
