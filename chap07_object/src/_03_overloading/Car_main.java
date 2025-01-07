package _03_overloading;

public class Car_main {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.add());
		
		System.out.println(car1.add(8));
		
		System.out.println(car1.add(5, 7));
		
		System.out.println(car1.add("븅신"));
		
		System.out.println(car1.add(5, 4.567));
		
		
		
	}

}
