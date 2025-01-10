package _05_pet;

public class Cat extends Pet {
	Cat() {
		this("고양이", "갈색", "사냥꾼");		
	}
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
	@Override
	public void sound() {
		System.out.println("miauuu~");
	}
	

}
