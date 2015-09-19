package thread.sample;

public class Singleton {
	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			System.out.println("Getting lock for "+Thread.currentThread().getName());
			synchronized (Singleton.class) {
				System.out.println("Lock acquired for "+Thread.currentThread().getName());
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}

}