package by.htp.lesson5.entity.brands.sub;

import by.htp.lesson5.entity.brands.Huawei;

public class Mate_Rs_Porsche_Design_512Gb extends Huawei{
	private String sName = String.format("%s Mate RS Porsche Design 512GB", sNameOfBrand);
	private double dPrice = 2100.96;
	
	public Mate_Rs_Porsche_Design_512Gb() {
		
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
