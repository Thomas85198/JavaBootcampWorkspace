package tw.luchienlin.java.normal;

public class LeapYearCalculator {

	public static boolean isLeapYear(int year){
	        
	        // year必須大於等於1
	        // 如果小於則false
	    	// if>1 
	        // 除4整除則，繼續判斷，非整除則不是閏年f
	        // 除100整除，繼續判斷，非整除則是閏年t
	        // 除400整除，則是閏年，非整除則不是閏年f
	    	// 整除100但不整除400則不是閏年 false
	    	// 整除100且整除400則為閏年 true
	        boolean result = false;
	        if (year >= 1 && year < 10000){
	        		System.out.println("year大於等於1，繼續判斷");
	           // 如果不整除4則false
	        		if (year%4==0) {
	        			System.out.println("year大於等於1且除4整除，繼續判斷");
	        			// 繼續判斷除100
	        			if (year%100==0) {
	        				System.out.println("year大於等於1且除4整除且除100整除，繼續判斷");
	        				// 繼續判斷除400
	        				if (year%400==0) {
	        					System.out.println("year大於等於1且除4整除且除100整除且除400整除，閏年");
	        					// 整除則是閏年
	        					result = true;
	        				} else {
	        					System.out.println("year大於等於1且除4整除且除100整除但除400不整除，false");
	        					// 不整除
	        					result = false;
	        				}
	        			} else {
	        				System.out.println("year大於等於1且除4整除且除100不整除，閏年");
	        			// 4整除，100不整除 則是閏年
	        			result = true;
	        			}
	        		} else {
	        			System.out.println("year大於等於1且除4不整除，false");
	        			// 不整除4直接不是閏年
	        			result = false;
	        		} 
	        	}else {
	        		System.out.println("year小於1，false");
	        		// 小於1直接錯
	        		result = false;         
	    }
	      return result;
	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(10000));

	}

}
