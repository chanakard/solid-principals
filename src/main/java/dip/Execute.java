package dip;

public class Execute {

	public static void main(String[] args) {
		
		ProductRepository prodRepo = ProductFactory.create();
		
		ProductCatalog cat = new ProductCatalog(prodRepo);
		
		cat.listProducts();
	}
}
