package tw.luchienlin.java.normal;

public class Main {
	
	public static void main(String[] args) {
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = " + myMinFloatValue);
		System.out.println("Float maximum value = " + myMaxFloatValue);
		System.out.println("=========================================");
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value = " + myMinDoubleValue);
		System.out.println("Double maximum value = " + myMaxDoubleValue);
		
		int myIntValue = 5;
		// 直接寫沒寫f會判定為double
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;
		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue);
		System.out.println("MyDoubleValue = " + myDoubleValue);
		
		double myPounds = 120d;
		double myKilogram = myPounds * 0.4539237;
		System.out.println(myKilogram);
		
		double pi = 3.1415927d;
		double anotherNumber = 3_000_000.4_567_890d;
		System.out.println(pi);
		System.out.println(anotherNumber);
	}
}
