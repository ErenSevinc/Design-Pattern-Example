package singletonDesignPattern;

public class SingletonLazy {
	private static SingletonLazy singleton;
	private static int count = 0;
	
	private SingletonLazy() {
		System.out.println("Singleton Object...");
	}
	
	public static SingletonLazy getObject() {
		
		if(singleton == null) {
			singleton = new SingletonLazy();
		}
		count ++;
		System.out.println(count);
		return singleton;
	}
	

}
