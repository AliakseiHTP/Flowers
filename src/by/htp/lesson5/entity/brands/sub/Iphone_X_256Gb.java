package by.htp.lesson5.entity.brands.sub;

import by.htp.lesson5.entity.brands.Apple;

public class Iphone_X_256Gb extends Apple{
	private String sName = String.format("%s iPhone X 256 GB", sNameOfBrand);
	private double dPrice = 1313.23;
	
	public Iphone_X_256Gb() {
		
	}

	@Override
	public String getName() {
		return sName;
	}
	
	@Override
	public double getPrice() {
		return dPrice;
	}

}
