package by.htp.lesson5.entity.baseMethods;

import java.util.ArrayList;

import by.htp.lesson5.entity.Product;

public class Filter {

	public void filtrSmartphoneByPrice(Product[] products, ArrayList<Product> filtredProducts, int iMin, int iMax) {
		for (int i = 0; i < products.length; i++) {
			if (products[i].getPriceOfSmartphone()<iMax && products[i].getPriceOfSmartphone()>iMin) {
				filtredProducts.add(products[i]);
			}
		}
	}
}
