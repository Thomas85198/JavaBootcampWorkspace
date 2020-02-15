package ReadingUserInputChallenge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter number #x:");

		
		int counter = 0;
		int sum = 0;
		
		// 如果這樣寫判斷，就一定要寫break
		// 或是直接寫counter < 10
		while(true) {
			int order = counter + 1;
			System.out.println("Enter number #" + order + ":");
			boolean hasNextInt = scanner.hasNextInt();
			
			if(hasNextInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
				if(counter == 10) {
					break;
				}
			} else {
				System.out.println("Invalid Number");
			}
			
			scanner.nextLine();
		}
		
		System.out.println("sum = " + sum);

		scanner.close();
		
	}

}
