package tw.luchienlin.java.normal;

public class Main {

	public static void main(String[] args) {
		
		int myValue = 10000;
		
		// 判斷int型別的最小值與最大值
		// Integer是Wrapper class
		// 32 bits
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
		System.out.println("========================================");
		// Byte 佔有8 bits
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minmum Value = " + myMinByteValue);
		System.out.println("Byte Maxmum Value = " + myMaxByteValue);
		System.out.println("========================================");
		// short 16 bits
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minmum Value = " + myMinShortValue);
		System.out.println("Short Maxmum Value = " + myMaxShortValue);
		System.out.println("========================================");
		// long 64 bits
		long myLongValue = 100L;
		long myMinlongValue = Long.MIN_VALUE;
		long myMaxlongValue = Long.MAX_VALUE;
		System.out.println("long Minmum Value = " + myMinlongValue);
		System.out.println("long Maxmum Value = " + myMaxlongValue);
		long bigLongLiteralValue = 2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);
		System.out.println("========================================");
		short bigShortLiteralValue = 32767;
		
		int myTotal = (myMinIntValue / 2);
		
		// Casting 型別轉換
		byte myNewByteValue = (byte)(myMinByteValue / 2);
		short myNewShortValue = (short)(myMinShortValue / 2);
		
		byte myByteValue = 123;
		short myShortValue = 32000;
		int myIntValue = 233333;
		long myLongValue1 = (long)(50000 + 10 * (myByteValue + myShortValue + myIntValue));
		System.out.println(myLongValue1);
		
		System.out.println("========================================");
		
	}

}
