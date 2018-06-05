package by.htp.lesson5.entity.brands;

import by.htp.lesson5.entity.Smartphone;

public abstract class Sumsung extends Smartphone {
	protected String sNameOfBrand = "Sumsung";
	private int iRating = 1;
	
	public Sumsung() {
		
	}
	
	public abstract String getName();
	
	public abstract double getPrice();
	
	@Override
	public int getRating() {
		return iRating;
	}
}
