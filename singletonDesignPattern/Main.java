package singletonDesignPattern;

public class Main {

	public static void main(String[] args) {
		//Singleton singleton = new Singleton();
		//Singleton.getObject();
		System.out.println("*****************");
		for(int i=0; i<10; i++) {
			SingletonEager.getObject();
		}
		System.out.println("*****************");
		
		SingletonLazy.getObject();
		
		System.out.println("*****************");
		
		DoubleCheckedLocking.getObject();

	}

}
