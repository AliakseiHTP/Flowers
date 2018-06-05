package by.htp.lesson5.entity.accessories;

import by.htp.lesson5.entity.Accessories;

public abstract class Headphones extends Accessories{
	protected String sNameOfAccessories = "headphones";
	
	public Headphones() {
		
	}
	
	public abstract String getName();
	
	public abstract double getPrice();
}
