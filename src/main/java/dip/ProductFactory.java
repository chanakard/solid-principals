package dip;

public class ProductFactory {

	public static ProductRepository create()
	{
		return new SqlProductRepository();
	}
}
