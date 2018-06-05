package by.htp.lesson5.entity.brands;

import by.htp.lesson5.entity.Smartphone;

public abstract class Htc extends Smartphone {
	protected String sNameOfBrand = "HTC";
	private int iRating = 2;
	
	public Htc() {
		
	}
	
	public abstract String getName();
	
	public abstract double getPrice();
	
	@Override
	public int getRating() {
		return iRating;
	}
}
