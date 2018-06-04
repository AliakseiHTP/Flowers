package by.htp.lesson5.entity;

public class Student extends Person{
	private double dAvgMark;

	public Student() {
		super("Aliaksei");
	}
	
	public Student(String sName, double dAvgMark) {
		this();
		this.dAvgMark = dAvgMark;
	}
	
	@Override
	public String toString() {
		return "name: " + sName + " avg " + dAvgMark;
	}
	
}
