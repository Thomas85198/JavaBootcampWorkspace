package tw.luchienlin.java.normal;

public class Main {

	public static void main(String[] args) {
		// byte
		
		// short
		
		// int
		
		// long
		
		// float
		
		// double
		
		// char
		
		// boolean
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more. ";
		System.out.println("myString is equal to " + myString);
		// 使用萬國碼在String
		myString = myString + " \u00A9 2019";
		System.out.println("myString is equal to " + myString);
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);
		String lastString = "10";
		int myInt = 50;
		// 這樣加會把myInt當作String加起來
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString);
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println("LastString is equal to " + lastString);
		
		
	}

}
