package _05_pet;

public class Dog extends Pet {
	Dog() {
		this("폼피츠", "흰색", "발랄함");
	}
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
	@Override
	public void sound() {
		System.out.println("wolf!");
	}
	
}
