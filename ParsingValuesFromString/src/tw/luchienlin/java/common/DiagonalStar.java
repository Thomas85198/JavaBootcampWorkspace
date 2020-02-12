package tw.luchienlin.java.common;

public class DiagonalStar {

	public static void main(String[] args) {
		printSquareStar(5);
		printSquareStar(8);
	}
	
	public static void printSquareStar(int number) {
		
		if(number<5) {
			System.out.println("Invalid Vlaue");
		}else {
			for(int row = 1; row <= number; row++) {
				for(int col = 1; col <= number; col++) {
					boolean isStar = (row == 1) || (col == 1) || (row == number) || (col == number) || (row == col) ||(col == number-row+1);
					System.out.print(isStar ? "*" : " " );
				}
				System.out.println();
			}
		}
	}
}