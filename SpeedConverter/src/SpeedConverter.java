
public class SpeedConverter {
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		
		if (kilometersPerHour < 0) {
			return -1;
		}
		
		// Math.round四捨五入的公式
		return Math.round(kilometersPerHour / 1.609);

	}
	
	public static void printConversion(double kilometersPerHour) {
		
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			// 透過toMilesPerHour四捨五入它
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + 
					" km/h= " + milesPerHour + 
					" mi/h");
			
		}
	}
}
