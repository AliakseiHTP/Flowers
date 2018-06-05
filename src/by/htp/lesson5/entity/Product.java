package by.htp.lesson5.entity;

public class Product{
	private Smartphone sp;
	private Accessories acc1;
	private Accessories acc2;
	private Accessories acc3;
	
	public Product(Smartphone sp, Accessories acc1, Accessories acc2, Accessories acc3) {
		this.sp = sp;
		this.acc1 = acc1;
		this.acc2 = acc2;
		this.acc3 = acc3;
	}
	
	public double getTotalPrice() {
		return sp.getPrice() + acc1.getPrice() + acc2.getPrice();
	}
	
	public double getPriceOfSmartphone() {
		return sp.getPrice();
	}
	
	public String getAllProductsWithCost() {
		return String.format("|%-44s|%-20s|%-12s|%-12s|%-5.2f$", sp.getName(), acc1.getName(),  acc2.getName(), acc3.getName(), getTotalPrice());
	}
	
	public int getRating() {
		return sp.getRating();
	}
	
}
