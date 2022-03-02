package lsk;

import java.util.ArrayList;
import java.util.List;

public class ProductUtils {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new InHouseProduct();
		Product p3 = new Product();
		
		List<Product> listProducts = new ArrayList<Product>();
		
		listProducts.add(p1);
		listProducts.add(p2);
		listProducts.add(p3);
		
		for (Product product : listProducts) {
			
			if(product instanceof InHouseProduct)
			{
				((InHouseProduct) product).applyDiscount();
			}
			System.out.println(product.discount);
		}
		
		for (Product product : listProducts) {
			System.out.println(product.discount);
		}
	}
}
