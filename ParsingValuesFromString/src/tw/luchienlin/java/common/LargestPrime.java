package tw.luchienlin.java.common;

public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLargestPrime(4444));
	}
	public static int getLargestPrime(int number) {
			int count = number;
			int primeCount = 0;
			int largestPrime = 0;
			
			// 先判斷 0, 1 與負數
			if(number <= 1) {
				return -1;
			}
			while(count > 0) {
				for(int i=1; i<=number; i++) {
					if(count == 1) {
						break;
					}
				
					if(i <= count) {
						if(count % i == 0) {
							primeCount++;
						}
						
						if(count == i && primeCount == 2) {
							if(number % count == 0) {
								largestPrime = count;
								count = 1;
							}
						}
					}
				}
				count--;
				primeCount = 0;
			}
			return largestPrime;
	}
}
	