package by.htp.lesson5.entity.accessories;

import by.htp.lesson5.entity.Accessories;

public abstract class Cable extends Accessories{
	protected String sNameOfAccessories = "cabel";
	
	public Cable() {
		
	}
	
	public abstract String getName();
	
	public abstract double getPrice();
	
}
