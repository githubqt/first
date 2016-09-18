package singleton;

public class Singleton1 {

	private static Singleton1 singleton1 = new Singleton1();

	private Singleton1() {
	};

	public static Singleton1 getInstance1() {
		return singleton1;
	}

	public static void main(String[] args) {
		System.out.println(singleton1);
	}
}
