package _06_ex;

public class Exercise9 {
	
	public static void main(String[] args) {
		
		Exercise ex1 = Exercise.getInstance();
		Exercise ex2 = Exercise.getInstance();
		
		System.out.println("ex1 == ex2 : " + (ex1 == ex2));
		
	}
	
}

class Excercise {
	
	public static void getInstance() {
	
	}
}