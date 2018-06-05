package by.htp.lesson5.entity.brands.sub;

import by.htp.lesson5.entity.brands.Lg;

public class V30_64Gb extends Lg{
	private String sName = String.format("%s V30 64GB", sNameOfBrand);
	private double dPrice = 643.33;
	
	public V30_64Gb() {
		
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
