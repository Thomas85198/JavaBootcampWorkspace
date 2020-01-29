package tw.luchienlin.java.normal;

public class OperatorChallenge {
	
	public static void main(String[] args) {
		
		double myVar1 = 20.00d;
		double myVar2 = 80.00d;
		
		
		double myTotal = myVar1 + myVar2 * 100.00;
		System.out.println("myTotal = " + myTotal);
		
		double myReminder = myTotal % 40.00;
		System.out.println("myReminder = " + myReminder);
		
		boolean myBoolean = (myReminder == 0)? true : false;
		
		System.out.println(myBoolean);
		
		if (!myBoolean) {
			System.out.println("Got some remainder");
		}
	}
}
