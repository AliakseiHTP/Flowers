package by.htp.lesson5.entity.brands;

import by.htp.lesson5.entity.Smartphone;

public abstract class Apple extends Smartphone {
	protected String sNameOfBrand = "Apple";
	private int iRating = 1;
	
	public Apple() {
		
	}
	
	public abstract String getName();
	
	public abstract double getPrice();
	
	@Override
	public int getRating() {
		return iRating;
	}
}
