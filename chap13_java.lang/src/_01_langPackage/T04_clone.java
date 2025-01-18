package _01_langPackage;
/*
clone() : 객체 복제
1. 반드시 clone하고자하는 클래스에 implements Cloneable 반드시 넣어줘야 한다
	: '이 클래스는 복제할 수 있는 클래스이다'라는것을 알려줄 목적
2. clone()을 오버라이딩하지 않아도 된다.
: 그러나 Object클래스의 clone()메소드는 접근제어자가 protected라서 같은 java.lang패키지에 있어야한다.
: 접근못함 오류발생
3. 2번과 같은 이유로 clone()을 오버라이딩 해야함
*/
class Point implements Cloneable {
	public static final Point clone = null;
	int x;
	int y;
	Point() {
		
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	@Override
	public Point clone() {
		Point obj = null;
		try {
			obj = (Point) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}

public class T04_clone {

	public static void main(String[] args) {
		Point original = new Point(3,4);
		Point copy = (Point)original.clone;
		System.out.println(original);
		System.out.println(copy);
		
		copy.x = 100;
		System.out.println(copy);

	}

}
