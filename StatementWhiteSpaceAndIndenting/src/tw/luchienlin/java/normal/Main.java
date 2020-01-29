package tw.luchienlin.java.normal;

public class Main {

	public static void main(String[] args) {
		// Statement in java
		int myVariable = 50;
		if(myVariable == 50) {
			System.out.println("Printed");
		}
		myVariable++;
		myVariable--;
		System.out.println("This is a test");
		
		System.out.println("This is"
				+ " another" 
				+ " still more");
		
		// Statement也可以寫在同一行，但不建議
		int anotherVariable = 50;myVariable--;System.out.println("This is another one");
		
		// 空白在Java裡面執行會被忽略
		int                       myVariable1 = 
				20;
	}

}
