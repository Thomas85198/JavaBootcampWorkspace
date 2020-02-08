package tw.luchienlin.java.whileloop;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));

	}

	// 最大公因數
	// 相除餘0
	// 被比較小的相相除
	// 相除後+1，當除數=number break
	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10) {
			return -1;
		}
		int gCDivisor = 0;
		// 比較誰比較大，這lowerNumber當截止就好
		int hNumber = 0;
		int lNumber = 0;
		if (first >= second) {
			hNumber = first;
			lNumber = second;
		} else if (second >= first){
			hNumber = second;
			lNumber = first;
		}
		for(int i = 1; i <= lNumber; i++) {
			if(lNumber % i == 0) {
				if(hNumber % i == 0) {
					gCDivisor = i;
				}
			}
		}
		return gCDivisor;
	}
}
