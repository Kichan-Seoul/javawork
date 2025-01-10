package _04_polyBuyerArrayList;

import java.util.ArrayList;

public class Buyer {
	int money = 500;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();
	
	void buy(Product p) { // b.buy(new Tv()) -> cart[0] = p
		if(money < p.getBonusPoint()) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		cart.add(p);
		System.out.println(p + "를 구입함");
	}
	
	void getInfo() {
		int sum = 0;
		String list = "";
		
		if(cart.isEmpty()) {
			System.out.println("구입한 물품이 없습니다");
			return;
		}
		System.out.println("구입한 물품 목록");
		for(int i=0; i<cart.size(); i++) {
			Product p1 = cart.get(i);
			sum += p1.price;
			list += p1 + ", ";
		}
		System.out.println("구입한 물품 목록 : " + list);
		System.out.println("구입한 물품의 합계 : " + sum + "만원입니다.");
	}
	
	void refund(Product p) {
		if(cart.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " 반품");
		} else {
			System.out.println("구입하지 않은 상품입니다.");
		}
	}
}
