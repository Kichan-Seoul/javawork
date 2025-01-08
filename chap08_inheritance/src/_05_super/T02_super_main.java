package _05_super;
class parent2 {
	int x = 10; // 인스턴스 변수
}

class child2 extends parent2{
	//int x = 200; // 인스턴스 변수
	void show() {
		System.out.println("X = " + x); // 지역변수 -> 인스턴스 변수 -> 부모 변수
		System.out.println("this.X = " + this.x); // 인스턴스 변수 -> 부모 변수
		System.out.println("super.X = " + super.x); // 부모의 변수
	}
}

public class T02_super_main {

	public static void main(String[] args) {
		child2 child2 = new child2();
		child2.show();
		
		
	}

}
