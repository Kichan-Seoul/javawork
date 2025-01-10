package _05_pet;

public class PetRun {

	public static void main(String[] args) {
		Pet pet1 = new Cat();
		Pet pet2 = new Dog();
		Pet pet3 = new Frog();
		
		pet1.sound();
		pet1.info();
		System.out.println(pet1);
		
		pet2.sound();
		pet2.info();
		System.out.println(pet2);
		
		pet3.sound();
		pet3.info();
		System.out.println(pet3);
		
	}

}
