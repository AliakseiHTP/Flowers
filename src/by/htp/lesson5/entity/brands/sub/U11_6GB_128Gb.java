package by.htp.lesson5.entity.brands.sub;

import by.htp.lesson5.entity.brands.Htc;

public class U11_6GB_128Gb extends Htc{
	private String sName = String.format("%s U11+ 6GB/128GB", sNameOfBrand);
	private double dPrice = 797.93;
	
	public U11_6GB_128Gb() {
		
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
