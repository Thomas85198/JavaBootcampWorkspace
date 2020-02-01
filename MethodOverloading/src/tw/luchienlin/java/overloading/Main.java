package tw.luchienlin.java.overloading;

public class Main {

	public static void main(String[] args) {
		// Overloading
		int newScore = calculateScore("Tim", 500);
		
		System.out.println("New Score is " + newScore);
		
		calculateScore(75);
		calculateScore();
		calcFeetAndInchesToCentimeters(4, 5);
		
		calcFeetAndInchesToCentimeters(157);
		
		getDurationString(30, 30);
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}
	
	// 寸轉公分
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if(feet < 0 || (inches < 0 && inches > 12)) {
			System.out.println("Invalid");
			return -1; 
		}else {
			double centimeters = (feet * 12) * 2.54;
			centimeters += inches * 2.54;
			System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
			return centimeters;
		}
	}
	
	// overload
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if(inches < 0) {
			return -1;
		} 
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
	
	// Seconds And Minutes Challenge 
	public static String getDurationString (int minutes, int seconds) {
		if (minutes < 0 || (seconds < 0 || seconds > 59)) {
			return "Invalid value";
		} else {
			// 小時等於分鐘/60整除
			// 餘數的分鐘等於新的分鐘
			// 秒數/60的+分鐘
			// 秒數等於剩餘的秒數
			// 1小時等於3600秒
			int hours = (minutes / 60) + (seconds / 60 / 60);
			System.out.println(hours + " HR " + minutes%60 + seconds/60 + "MN" + seconds%60 + "SEC" );
			return hours + " HR " + minutes%60 + seconds/60 + "MN" + seconds%60 + "SEC"; 
		}
	}
	
}
