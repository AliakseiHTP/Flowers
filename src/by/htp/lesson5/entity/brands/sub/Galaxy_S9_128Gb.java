package by.htp.lesson5.entity.brands.sub;

import by.htp.lesson5.entity.brands.Sumsung;

public class Galaxy_S9_128Gb extends Sumsung{
	private String sName = String.format("%s Galaxy S9 Dual SIM 128GB Exynos 9810", sNameOfBrand);
	private double dPrice = 947.54;
	
	public Galaxy_S9_128Gb() {
		
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
