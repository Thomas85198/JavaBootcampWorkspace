package tw.luchienlin.java.normal;

public class Practice {

	public static void main(String[] args) {
	
	int highScorePosition = calculateHighScorePosition(1500);
	displayHighScorePosition("Thoams", highScorePosition);
	
	highScorePosition = calculateHighScorePosition(900);
	displayHighScorePosition("Thoams", highScorePosition);

	highScorePosition = calculateHighScorePosition(400);
	displayHighScorePosition("Thoams", highScorePosition);
	
	highScorePosition = calculateHighScorePosition(50);
	displayHighScorePosition("Thoams", highScorePosition);
	
	// pass the 1000 所以會print 4，加>=才符合邏輯
	highScorePosition = calculateHighScorePosition(1000);
	displayHighScorePosition("Thomas", highScorePosition);
		
		
	}
	
	// create a Method called displayHighScorePosition
	public static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " managed to get into position " 
						 + position + " on the high score table" );
	}
	
	// create 2nd method called calculateHighScorePosition
	public static int calculateHighScorePosition(int playerScore) {
		
		if(playerScore >= 1000) {
			return 1;
		} else if(playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if(playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
	}

}
