package _02_LSP;

/*
리스코프 치환 원칙 (LSP, Liskov Substitution Principle)
- 자식 클래스는 최소한 부모 클래스의 기능은 수행할 수 있어야 한다.
*/

class Cat {
	void speak() {
		System.out.println("MIAU~");
	}
}

class WhiteCat extends Cat {
	String color = "white";
	@Override
	void speak() {
		System.out.println("miauuuuu~");
	}
}

class BlackCat extends Cat {
	String color = "Black";
	@Override
	void speak() {
		System.out.println("haaaaaaaaakk");
	}
}

public class T01_LSP {

	public static void main(String[] args) {
		Cat cat = new WhiteCat();
		cat.speak();
		
		cat = new BlackCat();
		cat.speak();
	}

}
