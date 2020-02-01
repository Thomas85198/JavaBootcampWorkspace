package tw.luchienlin.java.overloading;

public class PlayingCat {

	public static void main(String[] args) {

		isCatPlaying(true, 33);
	}

	// 超級高超寫法
	// 值得參考
	public static boolean isCatPlaying(boolean summer, int temp) {
		return (summer && (temp > 24 && temp < 46)) || (!summer && (temp > 24 && temp < 36));
	}
}
