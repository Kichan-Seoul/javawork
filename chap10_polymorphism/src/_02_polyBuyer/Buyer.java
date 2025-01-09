package _02_polyBuyer;

public class Buyer {
	int money;
	int bonusPoint;
	// 제품의 개수만큼 오버로딩을 해야함
	/*
	void buy(Computer com) {
		
	}
	void buy(Tv tv) {
		
	}
	void buy(GameDevice gd) {
		
	}
	*/
	
	// 형변환을 하면 모든 제품을 다 받을 수 있다.
	void buy(Product p) {
		if(money < p.getBonusPoint()) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		System.out.println(p + "를 구입함");
	}
}
