package by.htp.lesson5.entity.accessories.sub;

import by.htp.lesson5.entity.accessories.Cable;

public class Usb extends Cable{
	private String sName = String.format("USB %s", sNameOfAccessories);
	private double dPrice = 50.25;
	
	public Usb() {
		
	}
	
	public String getName() {
		return sName;
	}
	
	public double getPrice() {
		return dPrice;
	}
}
