package _02_LSP;

/*
리스코프 치환 원칙 (LSP, Liskov Substitution Principle)
- 자식 클래스는 최소한 부모 클래스의 기능은 수행할 수 있어야 한다.
*/

class Dog {
	void speak() {
		System.out.println("MIAU~");
	}
}

class WhiteDog extends Dog {
	String color = "white";
	@Override
	void speak() {
		System.out.println("miauuuuu~");
	}
}

class BlackDog extends Dog {
	String color = "Black";
	@Override
	void speak() {
		System.out.println("haaaaaaaaakk");
	}
}

public class T01_LSP2_Solution {

	public static void main(String[] args) {
		Dog dog = new WhiteDog();
		System.out.println(((WhiteDog)dog).color);
		dog.speak();
		
		dog = new BlackDog();
		dog.speak();
	}

}
