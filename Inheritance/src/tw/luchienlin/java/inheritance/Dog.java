package tw.luchienlin.java.inheritance;

public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String cont;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String cont) {
		// 繼承來自父類別的參數
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.cont = cont;
	}
	
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	// 寫他
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
//		super.move();
		move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}
	
	private void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}

//	@Override
//	public void move(int speed) {
//		System.out.println("Dog.move() called");
//		moveLegs(speed);
//		super.move(speed);
//	}
	
	
	
	
	
	
	
}
