package _04_polyBuyerArrayList;

public class Product {
	int price;
	int bonusPoint;
	
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
