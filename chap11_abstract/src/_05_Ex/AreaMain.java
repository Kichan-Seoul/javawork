package _05_Ex;

public class AreaMain {

	public static void main(String[] args) {
		InterArea Rectangle = new Rectangle(5, 6);
		InterArea Triangle = new Triangle(7,9);
		
		System.out.println("사각형의 면적 : " + Rectangle.area());
		System.out.println("삼각형의 면적 : " + Triangle.area());
		
	}

}
