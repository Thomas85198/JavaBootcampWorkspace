package tw.luchienlin.normal.loop;

public class SumThreeAndFive {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		// Create for statement using a range of numbers from 1 to 1000 inclusive（包括的）
		for(int i=1; i<=1000; i++) {
			if(i%3==0&&i%5==0) {
				sum +=i;
				System.out.println("第 "+(count+1)+" 數字 "+i);
				count++;
			}
			if(count == 5) {
				break;
			}
		}
	System.out.println("總和為：" + sum);
	}

}
