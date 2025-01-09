package _06_ex;

import java.util.Scanner;

public class Math_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		String name = sc.next();
		System.out.println("나이: ");
		int age = sc.nextInt();
		System.out.println("키: ");
		int height = sc.nextInt();
		System.out.println("몸무게: ");
		int weight = sc.nextInt();
		System.out.println("서식지: ");
		String area = sc.next();
		
		
		Math m1 = new Math(name, age, height, weight, area);
		System.out.println("\n"+m1.getDetails());
	

	}

}
