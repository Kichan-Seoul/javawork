package _02_car;

public class Ambulance extends Car {
	Ambulance(String model, String company) {
		super(model, company); // super : 부모의 생성자
		// TODO Auto-generated constructor stub
	}

	boolean siren;
	void siren() {
		if(siren = !siren) {
			System.out.println("Bio~Bio~");
		} else {
			System.out.println("Stopped siren");
		}
	}
	
	void firstAid() {
		System.out.println("Doing firstAid");
	}
	
}
