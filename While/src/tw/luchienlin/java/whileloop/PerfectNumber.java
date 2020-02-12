package tw.luchienlin.java.whileloop;

public class PerfectNumber {

	public static void main(String[] args) {
		
		System.out.println(isPerfectNumber(28));

	}
	
	public static boolean isPerfectNumber(int number) {
		int sum = 0;
		if(number == 0) {
			return false;
		}
		for(int i = 1; i < number; i++) {
			if(number % i == 0){
				sum += i;
			}
		}
		if(sum == number) {
			return true;
		}
		return false;
	}
}
