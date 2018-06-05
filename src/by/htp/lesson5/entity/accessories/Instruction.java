package by.htp.lesson5.entity.accessories;

import by.htp.lesson5.entity.Accessories;

public class Instruction extends Accessories{
	private String sName = "Instruction";
	private double dPrice = 1.00;
	
	public Instruction() {
		
	}
	
	public String getName() {
		return sName;
	}
	
	@Override
	public double getPrice() {
		return dPrice;
	}
}
