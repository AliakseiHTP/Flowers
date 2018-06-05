package by.htp.lesson5.entity.brands.sub;

import by.htp.lesson5.entity.brands.Htc;

public class U11_4GB_64Gb extends Htc{
	private String sName = String.format("%s U11+ 4GB/64GB", sNameOfBrand);
	private double dPrice = 748.06;
	
	public U11_4GB_64Gb() {
		
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
