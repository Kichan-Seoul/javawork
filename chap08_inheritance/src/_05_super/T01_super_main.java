package _05_super;
class parent {
	int x = 10; // 인스턴스 변수
}

class child extends parent{
	int x = 200; // 인스턴스 변수
	void show() {
		int x = 500; //지역 변수
		System.out.println("X = " + x); // 지역변수
		System.out.println("this.X = " + this.x); // 인스턴스 변수
		System.out.println("super.X = " + super.x); // 부모의 변수
	}
}

public class T01_super_main {

	public static void main(String[] args) {
		child child = new child();
		child.show();
		
		
	}

}
