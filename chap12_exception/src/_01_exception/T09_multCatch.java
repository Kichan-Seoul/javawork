package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// try 안에 여러개의 예외가 발생할 경우 예외의 갯수만큼 catch문 사용할 수 있다. 이때 catch 첫번째 부터 차례대로 본인의 예외의 클래스인지 확인 후 맞으면 예외처리
//아니면 다음번 catch문으로 내려간다

public class T09_multCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나누기할 정수 2개 입력 : " );

		try {
			int num1 = sc.nextInt();	// inputMismatch
			int num2 = sc.nextInt();
			
			System.out.println("몫 : " + num1 / num2);	// arithmetic
			System.out.println("나머지 : " + num1 % num2);
			
			int[] num = {1,2,3};
			System.out.println(num[3]);
			
		} catch(ArithmeticException e) {
			System.out.println("0으론 나누기가 안되어요!!!");
			//ae.printStackTrace(); // 호출스택에 있는 메소드 정보와 예외 메세지 화면 출력 
		//	System.out.println(	ae.getMessage()); // 예외클래스 인스턴스에 저장된 메시지 출력
		} catch(InputMismatchException b) {
			System.out.println("정수만 입력하거라");
		} catch(Exception f) { // Exception은 가장 상위 부모 : 모든 예외는 다 처리 한 후 맨 마지막에 써야 함
			System.out.println("예외 발생");
		}
	}

}
