package _01_langPackage;
/*
원래 Object클래스에 있는 hashCode()는 객체의 주소로 해시코드를 만든다

equals()를 오버라이딩 하여 값으로 비교하도록 만들면
hashCode()도 오버라이딩하여 논리적으로 두 객체가 같도록 만들어 준다
*/
import java.util.Objects;

class Equals2 extends Object {
	int value;
	Equals2(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		return value == ((Equals2)obj).value;
	}
	@Override
	public int hashCode() {
		return Objects.hash(value); // 1111
	}
	
}

public class T02_hashCode {

	public static void main(String[] args) {
		Equals2 e1 = new Equals2(10);
		Equals2 e2 = new Equals2(10);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		String s1 = new String("kichan");
		String s2 = new String("kichan");
		
		// String클래스에서 hashCode()를 오버라이딩 한 상태
		System.out.println(s1.equals(s2));
		
		// String클래스에서 hashCode()를 오버라이딩 한 상태
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		
		// 원래 객체의 해시코드(고유)
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
	}

}
