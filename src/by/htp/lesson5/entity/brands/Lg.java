package by.htp.lesson5.entity.brands;

import by.htp.lesson5.entity.Smartphone;

public abstract class Lg extends Smartphone {
	protected String sNameOfBrand = "LG";
	private int iRating = 3;
	
	public Lg() {
		
	}
	
	public abstract String getName();
	
	public abstract double getPrice();
	
	@Override
	public int getRating() {
		return iRating;
	}
}
