
public class Main {

	public static void main(String[] args) {
		// classname.就可以用方法
		long miles = SpeedConverter.toMilesPerHour(10.5);
		System.out.println("Miles = " + miles);
		
		SpeedConverter.printConversion(10.5);
	}
}
