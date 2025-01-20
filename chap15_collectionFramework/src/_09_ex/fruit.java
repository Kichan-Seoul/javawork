package _09_ex;

public class fruit implements Comparable<fruit> {
	private String name;
	private int price;
	public fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Fruit{name='" + name + "', price=" + price + "}";
	}


	@Override
	public int compareTo(fruit o) {
		if(price < o.price) {
			return -1;
		} else if(price == o.price) {
			return 0;
		} else {
			return 1;
		}

	}
	
}
