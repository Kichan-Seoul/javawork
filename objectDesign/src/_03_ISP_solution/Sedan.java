package _03_ISP_solution;

public class Sedan implements Car {

	@Override
	public void drive() {
		System.out.println("Driving");
	}

	@Override
	public void turnLeft() {
		System.out.println("Turn Left");
	}

	@Override
	public void turnRight() {
		System.out.println("Turn Right");
	}

	@Override
	public void stop() {
		System.out.println("Stop");
	}

	@Override
	public void water() {
		System.out.println("Water Splash");
	}

	@Override
	public void patientTransport() {
		System.out.println("Bio~ Bio~");
	}
	
}
