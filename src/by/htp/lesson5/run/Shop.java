package by.htp.lesson5.run;

import java.util.ArrayList;

import by.htp.lesson5.entity.*;
import by.htp.lesson5.entity.accessories.Instruction;
import by.htp.lesson5.entity.accessories.sub.*;
import by.htp.lesson5.entity.baseMethods.*;
import by.htp.lesson5.entity.brands.sub.*;

public class Shop {

	public static void main(String[] args) {
		Product[] stock = new Product[] {
				new Product(new Iphone_X_256Gb(), new Wire(), new Otg(), new Instruction()),
				new Product(new U11_4GB_64Gb(), new Bluetooth(), new Usb(), new Instruction()),
				new Product(new Mate_Rs_Porsche_Design_512Gb(), new Wire(), new Usb(), new Instruction()),
				new Product(new Mate_Rs_Porsche_Design_256Gb(), new Wire(), new Usb(), new Instruction()),
				new Product(new V30_128Gb(), new Bluetooth(), new Otg(), new Instruction()),
				new Product(new Galaxy_S9_128Gb(), new Bluetooth(), new Usb(), new Instruction()),
				new Product(new Iphone_X_64Gb(), new Wire(), new Usb(), new Instruction()),
				new Product(new V30_64Gb(), new Wire(), new Usb(), new Instruction()),
				new Product(new Galaxy_S9_64Gb(), new Bluetooth(), new Otg(), new Instruction()),
				new Product(new U11_6GB_128Gb(), new Bluetooth(), new Otg(), new Instruction())
		};
		ArrayList<Product> sortedStock = new ArrayList<>();
		ArrayList<Product> filtredBox = new ArrayList<>();
		int iMinPrice = 700, iMaxPrice = 1500;
		
		System.out.println("========================================List of available products=======================================");
		System.out.printf("|%-44s|%-20s|%-10s|%-10s|%-5s\n", "Model:", "Accessory#1:", "Accessory#2:", "Accessory#3:", "Total Price:");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		for(Product p: stock) {
			System.out.println(p.getAllProductsWithCost());
		}
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("===============================List of available products sorted by rating===============================");
		System.out.printf("|%-44s|%-20s|%-10s|%-10s|%-5s\n", "Model:", "Accessory#1:", "Accessory#2:", "Accessory#3:", "Total Price:");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		new Sort().sortByRating(stock,sortedStock);
		for(Product p: sortedStock) {
			System.out.println(p.getAllProductsWithCost());
		}
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("======================List of available products filtered with a given price range=======================");
		System.out.printf("|%-44s|%-20s|%-10s|%-10s|%-5s\n", "Model:", "Accessory#1:", "Accessory#2:", "Accessory#3:", "Total Price:");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		new Filter().filtrSmartphoneByPrice(stock, filtredBox,iMinPrice,iMaxPrice);
		for(Product p: filtredBox) {
			System.out.println(p.getAllProductsWithCost());
		}
		System.out.println("---------------------------------------------------------------------------------------------------------");
	}
}
