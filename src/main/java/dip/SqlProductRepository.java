package dip;

import java.util.Arrays;
import java.util.List;

public class SqlProductRepository implements ProductRepository{

	public List<String> getAllProducts() {
		return Arrays.asList("prod1","prod2");
	}



}
