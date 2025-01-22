package _05_ObjectStream;

import java.io.Serializable;

public class Phone implements Serializable{
	// 직렬화 : 객체를 스트림으로 만드는 작업 필수.
	private String name;
	private int price;
	
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Phone() {
		super();
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
		return " name : " + name + ", price : " + price;
	}

	
	
}
