package _05_super;
class parent3 {
	int x = 10;
	void show() {
		System.out.println("부모클래스 메소드");
	}
}
class child3 extends parent3{
	int x = 300;
	void show() {
		System.out.println("자식클래스 메소드");
	}
	void display() {
		show();
		super.show();
		
	}
}
public class T03_superMethod_main {

	public static void main(String[] args) {
		child3 child3 = new child3();
		child3.show();
		child3.display();
	}

}
