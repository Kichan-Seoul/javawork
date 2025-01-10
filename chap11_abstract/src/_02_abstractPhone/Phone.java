package _02_abstractPhone;

 public abstract class Phone {
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
	
	abstract void hangUp(); {
		if(hangUp = !hangUp) {
			System.out.println("Hang Up");
		} else {
			System.out.println("Hang Out");
		}
	}
	
	abstract void response(); {
		if(response = !response) {
			System.out.println("Sending Message");
		} else {
			System.out.println("Receiving Message");
		}
	}
		
}
