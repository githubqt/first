package singleton;

public class Singleton2 {

	public static Singleton2 singleton2;

	private Singleton2() {
	};

	public static synchronized Singleton2 getInstance2() {
		if (singleton2 == null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
