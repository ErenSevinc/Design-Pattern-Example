package factoryDesignPattern;

import factoryDesignPattern.factory.IphoneFactory;
import factoryDesignPattern.factory.PhoneFactory;
import factoryDesignPattern.factory.SamsungFactory;
import factoryDesignPattern.modal.Iphone;
import factoryDesignPattern.modal.Samsung;
import factoryDesignPattern.ui.Phone;

public class Main {
	public static void main(String[] args) {
		Iphone iphone7 = new Iphone("iphone7", "Iphone","1960mAh", 4.7);
		System.out.println(iphone7);
		
		Samsung samsungS9 = new Samsung("GalaxyS9", "Samsung", "240mAh", 5.7);
		System.out.println(samsungS9);
		
		System.out.println("**************");
		
		Phone phone1 = PhoneFactory.getPhone("iphone7", "iphone", "1960mAh", 4.7);
		System.out.println(phone1);
		
		Phone phone2 = PhoneFactory.getPhone("GalaxyS9", "SAMSUNG", "2400mAh", 5.7);
		System.out.println(phone2);
		
		System.out.println("**************");
		
		IphoneFactory iphoneFactory =new IphoneFactory();
		Phone iphone = iphoneFactory.getPhone("iphone7", "iphone", "1960mAh", 4.7);
		System.out.println(iphone);
		
		SamsungFactory samsungFactory =new SamsungFactory();
		Phone samsung = samsungFactory.getPhone("GalaxyS9", "Samsung", "2400mAh", 5.7);
		System.out.println(samsung);
		
		
		
	}

}
