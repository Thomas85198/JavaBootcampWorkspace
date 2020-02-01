package tw.luchienlin.java.overload;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		
		printYearsAndDays(525600);

	}

	 public static void printYearsAndDays(long minutes){
	       if (minutes < 0) {
	           System.out.println("Invalid Value");
	       } else{
	            // 計算一年有幾分鐘，並算出有幾年
	            long years = minutes / (365 * 24 * 60);
	            long days = (minutes / (24 * 60)) % 365;
	            System.out.println(minutes + " min = " + years + " y and " + days + " d");
	       }
	   }
	}
