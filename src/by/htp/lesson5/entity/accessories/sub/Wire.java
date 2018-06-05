package by.htp.lesson5.entity.accessories.sub;

import by.htp.lesson5.entity.accessories.Headphones;

public class Wire extends Headphones{
	private String sName = String.format("Wire %s", sNameOfAccessories);
	private double dPrice = 30.50;
	
	public Wire() {
		
	}
	
	@Override
	public double getPrice() {
		return dPrice;
	}

	public String getName() {
		return sName;
	}
}
