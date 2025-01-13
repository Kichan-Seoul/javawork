package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T06_inputMismatch {

	public static void main(String[] args) {
		/*	
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 3개 입력 : ");
			
			int sum = 0;
			try {
				sum = 0;
				for(int i=31; i<=3; i++) {
					System.out.println(i + "번째 정수 입력 : ");
					int num = sc.nextInt();
					sum += num;
				}
			} catch(InputMismatchException e) {
				System.out.println("정수만 입력하거라");
			}
			
			
			System.out.println("합계 : " + sum);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		
		int sum = 0;
		
			sum = 0;
			for(int i=31; i<=3; i++) {
				try {
					System.out.println(i + "번째 정수 입력 : ");
					int num = sc.nextInt();
					sum += num;
				} catch(InputMismatchException e) {
					System.out.println("정수만 입력하거라");
				}System.out.println("합계 : " + sum);
				
			}
		 		
	}

}
