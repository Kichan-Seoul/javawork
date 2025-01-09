package _02_polyBuyer;

public class Product {
	private int price;
	private int bonusPoint;
	
	public Product(int pirce) {
		this.price = price;
		bonusPoint = (int)(price* 0.05);
	}
	
	public int getPrice() {
		return price;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
}
