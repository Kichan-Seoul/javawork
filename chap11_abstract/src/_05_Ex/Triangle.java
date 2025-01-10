package _05_Ex;

public class Triangle implements InterArea {
	
	private double base;
	private double height;
	
	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	
	
	@Override
	public double area() {
		return 0.5 * base * height;
	}

}
