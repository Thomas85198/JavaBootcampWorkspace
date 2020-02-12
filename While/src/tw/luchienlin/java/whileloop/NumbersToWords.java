package tw.luchienlin.java.whileloop;

public class NumbersToWords {

	public static void main(String[] args) {
		numberToWords(0);
		
		numberToWords(1);
		
	}
	public static int getDigitCount(int number) {
		// 計算有幾位數
		int count = 0;
		if(number < 0) {
			return -1;
		} else {
			while(number / 10 != 0) {
				number = number/10;
				count++;
			}
			return count+1;
		}
	}
	
	public static int reserve(int number) {
		int reserve = 0;
		int digit;
		while(number != 0) {
			digit = number % 10;
			// reserve * 10+剩餘的個位數
			reserve = reserve * 10 + digit;
			number = number / 10;
		}
		return reserve;
	}
	
	public static void numberToWords(int number) {
		int digitCount = getDigitCount(number);
		number = reserve(number);
		// last digit 最後一位
		if(number < 0) {
			System.out.println("Invalid Value");
		}
		
		while(digitCount > 0) {
			switch(number%10) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			}
			number=number/10;	
			digitCount--;
		}
		
		}
		
	}


