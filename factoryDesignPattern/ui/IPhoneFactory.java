package factoryDesignPattern.ui;

public interface IPhoneFactory {
	public Phone getPhone(String modal, String brand, String battery, double inch);
	
}
