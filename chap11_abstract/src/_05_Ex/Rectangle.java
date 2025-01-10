package _05_Ex;

public class Rectangle implements InterArea {
	
	private double width;
	private double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
}
