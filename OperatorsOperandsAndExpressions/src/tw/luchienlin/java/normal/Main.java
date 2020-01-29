package tw.luchienlin.java.normal;

public class Main {

	public static void main(String[] args) {
		
		// 1 + 2 = 3
		int result = 1 + 2; 
		System.out.println("1 + 2 = " + result);
		int previousResult = result;
		System.out.println("previousResult = " + previousResult);
		// 3 - 1 = 2
		result = result - 1;
		System.out.println("3 - 1 = " + result);
		System.out.println("previousResult = " + previousResult);
		// 2 * 10 = 20
		result = result * 10; 
		System.out.println("2 * 10 = " + result);
		
		// 20 / 5 = 4
		result = result / 5;
		System.out.println("20 / 5 = " + result);
		// the remainder of (4 % 3) = 1
		result = result % 3;
		System.out.println("4 % 3 = " + result);
		previousResult = result;
		System.out.println("previousResult = " + previousResult);
		
		// result = result + 1;
		// 1 + 1 = 2
		result++; 
		System.out.println("1 + 1 = " + result);
		
		// 2 - 1 = 1
		result--;
		System.out.println("2 - 1 = " + result);
		
		// result = result + 2
		// 1 + 2 = 3
		result += 2;
		System.out.println("1 + 2 = " + result);
		
		// result = result * 10
		// 3 * 10 = 30
		result *= 10;
		System.out.println("3 * 10 = " + result);
		
		// result = result / 3
		// 30 / 3 = 10
		result /= 3;
		System.out.println("30 / 3 = " + result);
		
		// result = result - 2 
		result -= 2;
		System.out.println("10 - 2 = " + result);
		
		boolean isAlien = false;
		// 如果不寫大括弧只能印出一行code block
		if (isAlien == false) {
			System.out.println("It isn't an alien!");
			System.out.println("And I am scared of aliens");
		}
		
		int topScore = 80;
		if (topScore >= 100) {
			System.out.println("You got the high score!");
		}
		
		int secondTopScore = 81;
		if ((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than second top score and less than 100");
		}
		
		if((topScore > 90 )|| (secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are true");
		}
		
		int newValue = 50;
		if (newValue == 50 ) {
			System.out.println("This is true");
		}
		
		// 如果isCar值是false就不會執行
		boolean isCar = false;
		if (isCar) {
			System.out.println("This is not supposed to happen");
		}
		
		// 三元判斷式
		// 因為這邊是false所以判斷不會列印
		isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}
		
		
		
		
		
		
		
		
	}

}
