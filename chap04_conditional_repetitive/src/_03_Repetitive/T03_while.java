package _03_Repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		/*while(조건식) {
			조건식이 참인 동안 계속 실행
		}
		
		반복문에서 같이 사용
		- break : 반복문을 빠져 나올때
		- continue : continue뒤의 구문은 실행하지 않고 다시 반복문 실행*/
		
		/*for문을 while문으로 바꾸기
		출력 1 2 3 4 5*/
		/*for(int i=1; i<=5; i++) {
			System.out.println(i);
		}*/
		
		int i = 1; //초기식
		while(i<=5) { //조건식
			System.out.println(i);
			i++; //증감식
		}
		System.out.println("-----------------------");
		
		// 1~10까지의 합계
		int n = 1;
		int sum = 0;
		while(n<=10) {
			sum += n++;
		}
		System.out.println("1~10까지의 합계 : " + sum);

		//break
		int count = 0;
		while(true) {		
				System.out.println(++count);
				if(count == 5) {
					break;
				}
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자1개 입력(멈추려면 'q') : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'q') {
				break; //반복문을 끝낸다
			}
			System.out.println(ch);
		}
		System.out.println("프로그램 종료");
		
		sum = 0;
		//int t = 1;
		for(int t=1; t<=10; t++) {
			sum += t;
			if(sum >= 30) {
				break;
			}
		}
		System.out.println("8까지의 합 : " + sum);
		
		// continue
		// 1~100까지의 합계 중 3의 배수를 제외한 합계 구하기
		sum = 0;
		for(int a=1; a<=100; a++) {
			if(a%3 == 0) {
				continue;
			}
			sum += a;
		}
		System.out.println("3의 배수를 제외한 1~100까지의 합계 : " + sum);
	}

}
