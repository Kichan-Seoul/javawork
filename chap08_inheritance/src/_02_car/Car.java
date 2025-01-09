package _02_car;

public class Car {
	public String model;
	public String Company;
	boolean power;
	int speed;
	
	public Car(String model, String company) {
		this.model = model;
		this.Company = company;
	}
	
	void power() {
		if(power = !power) {
			System.out.println("차가 출발합니다");
		} else {
			System.out.println("시동을 끕니다");
		}
	}
	
	int speedUp() {
		speed += 5;
		return speed;
	}
	
	int speedDown() {
		speed -= 5;
		return speed;
	}
	
}
