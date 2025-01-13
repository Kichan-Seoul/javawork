package _08_interfacePolymorphism;
// interface 다형성
// interface는 객체 생성 안됨
// interface를 상속받은 클래스를 객체생성하여 그 객체를 interface타입으로 형변환
public class Product_main {

	public static void main(String[] args) {
		// Product product = new Product(); // interface는 객체 생성 안됨
		
		Product product = new Game(); // 형변환 가능
		System.out.print(product + "의");
		product.PowerOn();
		product.VolumeUp(7);
		
		Product product2 = new Tv();
		System.out.println(product2);
		
		
		
	}

}
