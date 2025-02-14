package _01_generic;

import java.util.ArrayList;

class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}
class Apple3 extends Fruit {
	public String toString() {
		return "Apple3";
	}
}
class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}
class Tjoeun {
	@Override
	public String toString() {
		return "Tjoeun";
	}
}
class Box3<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int index) {
		return list.get(index);
	}
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
}
public class T03_Generic {

	public static void main(String[] args) {
		Box3<Fruit> fruitBox3 = new Box3<>();
		Box3<Apple3> appleBox3 = new Box3<>();
		Box3<Tjoeun> tjoeunBox3 = new Box3<>();
		
		fruitBox3.add(new Fruit()); // 자신의 타입 넣음
		fruitBox3.add(new Apple3()); // 자식의 타입을 부모타입으로 자동형변환이 되어 넣음
		fruitBox3.add(new Grape());
		// fruitBox3.add(new Tjoeun()); // 오류 : 타입이 맞지 않음
		
		appleBox3.add(new Apple3()); // Apple3만 넣을 수 있다
		// appleBox3.add(new Fruit()); // 오류 : 타입이 맞지 않음
		
		tjoeunBox3.add(new Tjoeun()); // Tjoeun만 넣을 수 있다
		
		System.out.println(fruitBox3);
		System.out.println(appleBox3);
		System.out.println(tjoeunBox3);

	}

}
