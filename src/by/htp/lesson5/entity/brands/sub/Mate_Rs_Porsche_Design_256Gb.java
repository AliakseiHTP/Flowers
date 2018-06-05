package by.htp.lesson5.entity.brands.sub;

import by.htp.lesson5.entity.brands.Huawei;

public class Mate_Rs_Porsche_Design_256Gb extends Huawei{
	private String sName = String.format("%s Mate RS Porsche Design 256GB", sNameOfBrand);
	private double dPrice = 1945.53;
	
	public Mate_Rs_Porsche_Design_256Gb() {
		
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
