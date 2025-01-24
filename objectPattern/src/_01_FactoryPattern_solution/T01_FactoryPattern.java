package _01_FactoryPattern_solution;

public class T01_FactoryPattern {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.SetName("tv");
		System.out.println(p1);
		
		Product p2 = new Product();
		p2.SetName("computer");
		System.out.println(p2);
	}

}
