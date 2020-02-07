package tw.luchienlin.java.whileloop;

public class Main {

	public static void main(String[] args) {
		int count = 6;
//		while(count != 6) {
//			System.out.println("Count value is " + count);
//			count++;
//		}
//		
		// FOR LOOP BELOW IS NOT IDENTICAL TO THE ABOVE WHILE LOOP!
//		for(int i=1; i<7; i++) {
//			System.out.println("Count value is " + count);
//		}
//		for(count=1;count!=6;count++) {
//			System.out.println("Count value is " + count);
//		}
		
		
//		count = 1;
//		while(true) {
//			if(count == 6) {
//				break;
//			}
//			System.out.println("Count value is " + count);
//			count++;
//		}
//		do {
//			System.out.println("Count value was " + count);
//			count++;
//			
//			if(count > 100) {
//				break;
//			}
//		} while(count != 6);
		int number = 4;
		int finishNumber = 20;
		int sum = 0;
		int evenNumbersFound = 0;
		while(evenNumbersFound<5) {
			number++;
			
			if(!isEvenNumber(number)) {
				// 如果不是偶數則跳出if block
				continue;
			}
			
			sum += number;
			if(evenNumbersFound >= 5) {
				break;
			}
			System.out.println("Even number " + number);
			evenNumbersFound++;
			
		}
		System.out.println("EvenNumbersFound " + evenNumbersFound);
		System.out.println("The total number " + sum);
		
		
		
		
	}
	
	public static boolean isEvenNumber(int num) {
		if(num%2 == 0) {
			return true;
		}
		return false;
	}

}
