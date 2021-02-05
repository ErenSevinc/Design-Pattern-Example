package factoryDesignPattern.factory;

import factoryDesignPattern.modal.Samsung;
import factoryDesignPattern.ui.IPhoneFactory;
import factoryDesignPattern.ui.Phone;

public class SamsungFactory implements IPhoneFactory {

	@Override
	public Phone getPhone(String modal, String brand, String battery, double inch) {
		return new Samsung(modal, brand, battery, inch);
	}
	
}
