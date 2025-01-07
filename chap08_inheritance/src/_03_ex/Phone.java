package _03_ex;

public class Phone {
	String model;
	String color;
	boolean bell;
	boolean hangUp;
	boolean hangOut;
	boolean response;
	
	Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void bell() {
		if(bell = !bell) {
			System.out.println("Ring Ding Dong~");
			} else {
			System.out.println("Fuck Call");
		}
	}
	
	void hangUp() {
		if(hangUp = !hangUp) {
			System.out.println("Hang Up");
		} else {
			System.out.println("Hang Out");
		}
	}
	
	void response() {
		if(response = !response) {
			System.out.println("Sending Message");
		} else {
			System.out.println("Receiving Message");
		}
	}
		
}
