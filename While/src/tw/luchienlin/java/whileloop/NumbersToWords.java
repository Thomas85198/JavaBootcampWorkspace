package tw.luchienlin.java.whileloop;

public class NumbersToWords {

	public static void main(String[] args) {
		numberToWords()
		
		
	}
	
	public static int numberToWords(int number) {
		int count = 0;
		// last digit 最後一位
		if(number < 0) {
			System.out.println("Invalie Value");
			return -1;
		}
		while(number%10!= 0) {
			if(number%10==0) {
				break;
			}
			count++;
			number=number/10;	
		}
		return count;
		
	}

}
