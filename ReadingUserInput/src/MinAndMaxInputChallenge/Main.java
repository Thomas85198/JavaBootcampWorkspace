package MinAndMaxInputChallenge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		// boolean first = true;
				
		while(true) {
			System.out.println("ENTER NUMBER:");
			boolean isAnInt = scanner.hasNextInt();
			
			if(isAnInt) {
				int number = scanner.nextInt();
				// 不太懂flag在這邊的事情
//				if(first) {
//					first = false;
//					min = number;
//					max = number;
//				}
//				
				if(number > max) {
					max = number;
				}
				
				if(number < min) {
					min = number;
				}
			} else {
				break;
			}

			
		}
		System.out.println("min= " + min + ", max= " + max);
		scanner.close();
	}

}
