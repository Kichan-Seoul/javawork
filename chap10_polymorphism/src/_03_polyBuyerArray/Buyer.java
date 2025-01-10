package _03_polyBuyerArray;

public class Buyer {
	int money;
	int bonusPoint;
	Product[] cart = new Product[10];
	int index = 0;
	
	void buy(Product p) { // b.buy(new Tv()) -> cart[0] = p
		if(money < p.getBonusPoint()) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		cart[index++] = p;
		System.out.println(p + "를 구입함");
	}
	
	void getInfo() {
		int sum = 0;
		
		System.out.println("구입한 물품 목록");
		for(int i=0; i<cart.length; i++) {
			sum += cart[i].price;
			System.out.print(cart[i] + ", ");
		}
		System.out.println();
		System.out.println("구입한 물품의 합계 : " + sum + "만원입니다.");
	}
	
}
