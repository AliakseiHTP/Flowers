package by.htp.lesson5.entity.baseMethods;

import java.util.ArrayList;

import by.htp.lesson5.entity.Product;

public class Sort {
	private Product tempProduct;
	
	public void sortByRating(Product[] products, ArrayList<Product> sortedProducts) {
		for(Product p: products) {
			sortedProducts.add(p);
		}
		for(int i = 1; i < sortedProducts.size(); i++) {
			for(int j = sortedProducts.size()-1; j >= i; j--) {
				if(sortedProducts.get(j-1).getRating() > sortedProducts.get(j).getRating()) {
					tempProduct = sortedProducts.get(j-1);
					sortedProducts.set(j-1,sortedProducts.get(j));
					sortedProducts.set(j,tempProduct);
				}
			}
		}
	}
}
