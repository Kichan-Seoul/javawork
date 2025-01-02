package _03_Repetitive;

import java.util.Scanner;

public class T04_do_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*do~while
		
		do {
			실행문
		} while(조건식); -> 조건식을 따져서 참이면 do~while문 실행*/
		
		boolean b1 = false;
		while(b1) {
			System.out.println("while 조건식");
		}
		// 조건을 나중에 따짐
		do {
			System.out.println("do~while 조건식");
		} while(b1);

		int i1 = 0;
		do {
			System.out.println("1. for문설명, 2. while문설명, 3. do-while문 설명, 0.끝내려면 입력 : ");
			i1 = sc.nextInt();
			switch(i1) {
			case 1:
				System.out.println("반복할 횟수가 정해져 있을 때 사용하면 좋음");
				break;
			case 2:
				System.out.println("특정 조건에 도달했을 때 break를 사용하여 종료할 때 유용");
				break;
			case 3:
				System.out.println("조건을 나중에 따지므로 무조건 한번은 실행");
			}
			
		} while(i1 != 0); // 거짓이 되어야 멈춘다
		System.out.println("End");
		
		
	}

}
