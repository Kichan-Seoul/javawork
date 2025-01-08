package _05_super;
class parent4 {
	int x;
	int z;
	parent4() {
		System.out.println("부모생성자 호출");
		x = 10;
		z = 10;
	}
}
class child4 extends parent4 {
	int x;
	int y;
	child4() {
		System.out.println("자식생성자 호출");
		x = 10*10;
		y = 20*20;
	}
}
class grandChild extends child4 {
	int x;
	grandChild() {
		System.out.println("손자생성자 호출");
		x = 10*10*10;
	}
}
public class T04_2번상속_main {

	public static void main(String[] args) {
		/*parent4 parent4 = new parent4();
		child4 child4 = new child4();*/
		grandChild gc = new grandChild();
		System.out.println(gc.x);
		//System.out.println(gc.super.x); // super는 상속받은 곳에서만 사용가능
		System.out.println(gc.y);
		System.out.println(gc.z);

	}

}
