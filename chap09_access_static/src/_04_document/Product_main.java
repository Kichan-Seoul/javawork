package _04_document;
/*
고유의 제품번호
제품의 개수 (객체가 생성된 개수)
생성자(고유한 제품번호)
*/
public class Product_main {

	public static void main(String[] args) {
		Product p1 = new Product(); //고유의 제품번호 (더조은1)
		Product p2 = new Product(); //고유의 제품번호 (더조은2)
		Product p3 = new Product(); //고유의 제품번호 (더조은3)
		//(출력문)생성된 총 제품의 개수 : 3
		Product p4 = new Product(); //고유의 제품번호 (더조은4)
		Product p5 = new Product(); //고유의 제품번호 (더조은5)
		//(출력문)생성된 총 제품의 개수 : 5
	}

}
