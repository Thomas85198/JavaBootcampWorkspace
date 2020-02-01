package tw.luchienlin.java.overloading;

public class Main {

	// 新增錯誤訊息的變數
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";
	
	public static void main(String[] args) {
		
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(60));
		System.out.println(getDurationString(-41));
	}

	public static String getDurationString(int mins, int secs) {

		if (mins < 0 || (secs < 0 || secs > 59)) {
			return INVALID_VALUE_MESSAGE;
		} else {
			// 小時等於分鐘/60整除
			// 餘數的分鐘等於新的分鐘
			// 秒數/60的+分鐘
			// 秒數等於剩餘的秒數
			// 1小時等於3600秒
			// 秒數不用因為沒超過60
			int hours = mins / 60;
			// 把原本輸入的分鐘數減少
			mins = mins % 60;
			
			// 如果還沒大於10的話前面要加一個0
			String hoursString = hours + "h";
			if(hours < 10) {
				hoursString = "0" + hoursString;
			}
			
			String minutesString = mins + "m";
			if(mins < 10) {
				minutesString = "0" + minutesString;
			}
			
			String secondsString = secs + "s";
			if(secs < 10) {
				secondsString = "0" + secondsString;
			}
			
//			return (hours + "h " + mins + "m " + secs + "s ");
			return hoursString + " " + minutesString + " " + secondsString + " ";
		}
	}

	public static String getDurationString(int secs) {

		if (secs < 0) {
			return INVALID_VALUE_MESSAGE;
		} else {
			// 小時等於分鐘/60整除
			// 餘數的分鐘等於新的分鐘
			// 秒數/60的+分鐘
			// 秒數等於剩餘的秒數
			// 1小時等於3600秒
			// 秒數不用因為沒超過60
			int mins = secs / 60;
			secs = secs % 60;
			return getDurationString(mins, secs);
		}
	}

}
