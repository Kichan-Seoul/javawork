package _01_abstract;

public class Frog extends Pet {
	Frog() {
		this("개구리", "green", "dirty");
	}
	Frog(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	@Override
	public void sound() {
		System.out.println("개굴");
	}
	
}
