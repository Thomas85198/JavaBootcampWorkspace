package tw.luchienlin.java.normal;

public class Main {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 100;
		int levelCompleted = 2;
		int bonus = 3;
		
		calculateScoreOriginal();
		
		calculateScoreOriginal();
		
		// 執行方法
		calculateScore(true, 800, 5, 100);
		
//		if (score < 5000 && score > 1000) {
//			System.out.println("Your score was less than 5000 but greater than 1000");
//		} else if(score < 1000) {
//			System.out.println("Your score less than 1000");
//		} else {
//			System.out.println("This was executed");
//		}
		
		// retrun int的用法
		int highScore = calculateScoreInt(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		// 寫在這邊會看不到if裡面finaScore的區域變數
		// int savedFinalScore = finalScore;
		
		
		calculateScore(true, 10000, 8, 200);
		
//		if(gameOver) {
//			int finalScore = score + (levelCompleted * bonus);
//			System.out.println("Second score was " + finalScore);
//		}
//		
	}
	
	// 寫method
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=1000;
			System.out.println("Your final score was " + finalScore);
		}
	}
	public static void calculateScoreOriginal() {
		boolean gameOver = true;
		int score = 100;
		int levelCompleted = 2;
		int bonus = 3;
		
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=1000;
			System.out.println("Your final score was " + finalScore);
		}
	}
	public static int calculateScoreInt(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=1000;
			return finalScore;
		}else {
			return -1;
		}
	}

}
