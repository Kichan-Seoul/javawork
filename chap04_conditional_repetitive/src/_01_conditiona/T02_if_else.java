package _01_conditiona;
import java.util.*;
public class T02_if_else {

	public static void main(String[] args) {
		/* if(조건식) {
		 * 		조건식이 참일 때 실행할 구문
		 * } else {
		 * 	조건식이 거짓일 때 실행할 구문
		 * }
		 */
		int score = 75;
		if(score >= 70) {
			System.out.println("축하합니다");
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
			System.out.println("다음 기회에 ㅜ");
		}
		
		int num1 = 100; //양수(0포함)인지 음수인지 출력
		if(num1 >= 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		//사용자로부터 정수를 입력받아 짝수인지 홀수인지 구분하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시면 짝수, 홀수 구분을 해드립니다.");
		int number = sc.nextInt();
		if(number % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
	}

}
