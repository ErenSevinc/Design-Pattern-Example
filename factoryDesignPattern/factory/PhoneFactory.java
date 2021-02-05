package factoryDesignPattern.factory;

import factoryDesignPattern.modal.Iphone;
import factoryDesignPattern.modal.Samsung;
import factoryDesignPattern.ui.Phone;

public class PhoneFactory {
	
	public static Phone getPhone(String modal, String brand, String battery, double inch) {
		Phone phone;
		if("Iphone".equalsIgnoreCase(brand)) {
			phone = new Iphone(modal, brand, battery, inch);
		}
		else if("Samsung".equalsIgnoreCase(brand)) {
			phone = new Samsung(modal, brand, battery, inch);
		}
		/*
		 	... Xaomi, Huawei, Sony, LG 
		*/
		else {
			throw new RuntimeException("Brand is not valid");
		}
		// peki bu if-else kullanmadan olmuyor mu?(abstact factory) 
		
		return phone;
	}
}
