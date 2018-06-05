package by.htp.lesson5.entity.brands.sub;

import by.htp.lesson5.entity.brands.Apple;

public class Iphone_X_64Gb extends Apple{
	private String sName = String.format("%s iPhone X 64 GB", sNameOfBrand);
	private double dPrice = 1196.89;
	
	public Iphone_X_64Gb() {
		
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
