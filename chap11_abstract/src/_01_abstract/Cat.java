package _01_abstract;
//추상클래스를 상속받은 클래스는 반드시 추상메소드를 구현해야 한다

public class Cat extends Pet {
	Cat() {
		this("고양이", "갈색", "사냥꾼");		
	}
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	//추상메소드에 구현할 내용이 없다면 빈 껍데기라도 써놔야한다
	/*@Override
	void sound() {
		// TODO Auto-generated method stub
		
	}*/
	
	@Override
	public void sound() {
		System.out.println("miauuu~");
	}
	

}
