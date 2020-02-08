package tw.luchienlin.java.common;

public class Main {

	public static void main(String[] args) {
		String numberAsString = "2018.125";
		System.out.println("numberAsString= " + numberAsString);
		
		// 數字轉字串
		// Wrapper Class
		// Wrapper Class有parseInt
		// 但如果有其他不能計算的字就會有誤
		double number = Double.parseDouble(numberAsString);
		System.out.println("number = " + number);
		
		numberAsString += 1;
		number += 1;
		
		// 字串+1，就是後面加一
		// 數值才會+1
		System.out.println("numberAsString = " + numberAsString);
		System.out.println("number = " + number);

	}

}
