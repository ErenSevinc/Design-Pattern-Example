package factoryDesignPattern.factory;

import factoryDesignPattern.modal.Iphone;
import factoryDesignPattern.ui.IPhoneFactory;
import factoryDesignPattern.ui.Phone;

public class IphoneFactory implements IPhoneFactory {

	@Override
	public Phone getPhone(String modal, String brand, String battery, double inch) {
		return new Iphone(modal, brand, battery, inch);
	}



}
