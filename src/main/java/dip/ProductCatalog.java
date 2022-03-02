package dip;

import java.util.List;

public class ProductCatalog {

	ProductRepository prodRepo;
	
	public ProductCatalog(ProductRepository prodRepo)
	{
		this.prodRepo = prodRepo;
	}
	
	public void listProducts()
	{
		List<String> listProduct = prodRepo.getAllProducts();
		System.out.println(listProduct);
	}
	
}
