package tw.luchienlin.normal.loop;

public class SumOddRange {

	public static void main(String[] args) {
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		sumOdd(13, 13);
		sumOdd(100, 100);
		sumOdd(100, -100);
		sumOdd(100, 1000);
	}	
	public static boolean isOdd(int number) {
		boolean flag = false;
		if(number > 0) {
			if(number%2 != 0) {
				// 判斷是否為奇數
				// System.out.println(number + " 是奇數");
				flag = true;
			}
		}else {
			flag = false;
		}
		return flag;
	}
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if(end >= start && start > 0 && end > 0) {
			for(int i = start; i <= end; i++) {
				if(isOdd(i)) {
					sum += i;
				}
			}
		} else {
			return -1;
		}
		return sum;
	}
	


}
