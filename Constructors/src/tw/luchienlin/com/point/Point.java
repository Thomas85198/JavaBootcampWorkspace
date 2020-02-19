package tw.luchienlin.com.point;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}

	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		double distance = Math.sqrt(Math.pow(getY()-0, 2)+Math.pow(getX()-0, 2));
		return distance;
	}
	
	public double distance(int x, int y) {
		double distance = Math.sqrt(Math.pow(y-getY(), 2)+Math.pow(x-getX(), 2));
		return distance;
	}
	
	// 宣告物件參數，裡面可以給其他物件名稱
	public double distance(Point another) {
		return distance(another.x, another.y);
		
	}
	
	
	
	
	
	
	
}
