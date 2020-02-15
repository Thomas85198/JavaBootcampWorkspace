import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Build in class let can read user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your year of birth:");
		
		boolean hasNextInt = scanner.hasNextInt();
		
		if(hasNextInt) {
			int yearOfBirth = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			int age = 2018 - yearOfBirth;
			
			// 做判斷
			if(age >= 0 && age <= 100) {
				System.out.println("Your name is " + name + ", and you are " + age + " years old.");
			} else {
				System.out.println("Invalid year of birth");
			}
			
			// name 當成要抓取輸入的變數
			System.out.println("Your name is " + name);
			
			System.out.println("Your birth is " + yearOfBirth);
			
			System.out.println("Your are " + age + " years old.");
		} else {
			System.out.println("Unable to parse year of birth");
		}
		
		scanner.close();
		
	}

}
