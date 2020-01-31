package tw.luchienlin.java.normal;

public class BarkingDog {

    // 第一個boolean是狗已經在叫了，如果是true
    // 第二個int時間介於0-23
    // 只有8點以前或22點以後，結果是true
    // 少於0或大於23也是false
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        boolean result = false;
        if(hourOfDay < 0 || hourOfDay > 23) {
            result = false;
        } else if(hourOfDay >= 8 && hourOfDay <= 22) {
            result = false;   
        } else if(hourOfDay > 0 || hourOfDay < 8 || hourOfDay > 22) {
            if (barking == true){
                result = true; 
            } else {
                result = false;
            }
        }
        return result; 
      
    }
}