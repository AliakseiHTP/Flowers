package by.htp.lesson5.entity.accessories.sub;

import by.htp.lesson5.entity.accessories.Headphones;

public class Bluetooth extends Headphones{
	private String sName = String.format("Bluetooth %s", sNameOfAccessories);
	private double dPrice = 78.88;
	
	public Bluetooth() {
		
	}
	
	@Override
	public double getPrice() {
		return dPrice;
	}

	public String getName() {
		return sName;
	}
}
