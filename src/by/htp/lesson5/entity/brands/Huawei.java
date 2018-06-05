package by.htp.lesson5.entity.brands;

import by.htp.lesson5.entity.Smartphone;

public abstract class Huawei extends Smartphone {
	protected String sNameOfBrand = "Huawei";
	private int iRating = 3;
	
	public Huawei() {
		
	}
	
	public abstract String getName();
	
	public abstract double getPrice();
	
	@Override
	public int getRating() {
		return iRating;
	}
}
