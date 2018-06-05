package by.htp.lesson5.entity.accessories.sub;

import by.htp.lesson5.entity.accessories.Cable;

public class Otg extends Cable{
	private String sName = String.format("OTG %s", sNameOfAccessories);
	private double dPrice = 30.50;
	
	public Otg() {
		
	}
	
	@Override
	public double getPrice() {
		return dPrice;
	}

	public String getName() {
		return sName;
	}
}
