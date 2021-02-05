package factoryDesignPattern.modal;

import factoryDesignPattern.ui.Phone;

public class Samsung implements Phone {
	private String modal;
	private String brand;
	private String battery;
	private double inch;
	
	public Samsung(String modal, String brand, String battery, double inch) {
		super();
		this.modal = modal;
		this.brand = brand;
		this.battery = battery;
		this.inch = inch;
	}

	@Override
	public String getModal() {
		// TODO Auto-generated method stub
		return modal;
	}
	
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String getBattery() {
		// TODO Auto-generated method stub
		return battery;
	}

	@Override
	public double getInch() {
		// TODO Auto-generated method stub
		return inch;
	}

	@Override
	public String toString() {
		return "Samsung [modal=" + modal + ", brand=" + brand + ", battery=" + battery + ", inch=" + inch + "]";
	}
	
	

	
}
