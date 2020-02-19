package tw.luchienlin.java.inheritance;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog = new Dog("YorkiE", 8, 20, 2, 4, 1, 20, "Long silky");
		// 繼承的一樣可以呼叫父親的方法
		animal.eat();
 		System.out.println("=====");
		dog.eat();
		System.out.println("=====");
		//dog.walk();
		dog.run();
		
		

	}

}
