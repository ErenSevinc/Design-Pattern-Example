package singletonDesignPattern;

public class DoubleCheckedLocking {
	
	private  static DoubleCheckedLocking singleton;
	private static int count = 0;

	private DoubleCheckedLocking() {
		System.out.println("Singleton Object...");
	}

	public static DoubleCheckedLocking getObject() {
		if (singleton== null) {
			synchronized (DoubleCheckedLocking.class) {
				if (singleton == null) {
					singleton = new DoubleCheckedLocking();
				}
			}
		}
		count ++;
		System.out.println(count);
	    return singleton;
	}

}
