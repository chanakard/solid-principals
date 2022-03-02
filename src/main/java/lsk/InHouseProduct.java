package lsk;

public class InHouseProduct extends Product {

	
	@Override
	public double getDiscount()
	{
		this.applyDiscount();
		return discount;
	}
	
	public void applyDiscount()
	{
		discount = discount * 1.5;
	}
}
