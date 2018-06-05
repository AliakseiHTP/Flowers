package by.htp.lesson5.entity.brands.sub;

import by.htp.lesson5.entity.brands.Lg;

public class V30_128Gb extends Lg{
	private String sName = String.format("%s V30 128GB", sNameOfBrand);
	private double dPrice = 673.25;
	
	public V30_128Gb() {
		
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
