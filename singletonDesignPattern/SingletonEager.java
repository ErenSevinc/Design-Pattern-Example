package singletonDesignPattern;

public class SingletonEager {
	private static SingletonEager singleton =new SingletonEager();
	private static int count = 0;
	
	private SingletonEager() {
		System.out.println("Singleton Object...");
	}
	
	public static SingletonEager getObject() {
		count ++;
		System.out.println(count);
		return singleton;
	}
	
	

}
