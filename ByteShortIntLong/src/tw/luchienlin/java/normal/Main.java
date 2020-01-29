package tw.luchienlin.java.normal;

public class Main {

	public static void main(String[] args) {
		
		int myValue = 10000;
		
		// 判斷int型別的最小值與最大值
		// Integer是Wrapper class
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		
		// overflow
		System.out.println("Bused MAX value = " + (myMaxIntValue + 1));
		System.out.println("Bused MIN value = " + (myMinIntValue - 1));
		
		// 底線可以忽略
		int myMaxIntTest = 2_147_483_647;
		System.out.println(myMaxIntTest);
		
		
	}

}
