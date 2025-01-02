package _02_Ex;

import java.util.Scanner;

public class T02_Ex02 {

	public static void main(String[] args) {
		/*1.  주사위의 숫자 맞추기 게임
		랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
		사용자로 부터 숫자 입력받아서
		숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
		못맞췄으면 계속 물어보기*/
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random() * 6) + 1;
		while(true) {
			System.out.println("1~6 중 한개를 입력하시오.");
			int putnum = sc.nextInt();
			if(putnum != number) {
				System.out.println("NOPE. Try again");
			} else {
				System.out.println("Congratuation! Collect!\n");
				break;
			}
		} 
		
		/*2. 구구단 옆으로 출력하기
		   ex)
		   2*1= 2   3*1= 3   4*1= 4   5*1= 5   6*1= 6   7*1= 7   8*1= 8    9*1= 9
		   2*2= 4   3*2= 6   4*2= 8   5*2=10  6*2=12   7*2=14   8*2=16   9*2=18 
		   ....
		   2*9=18   3*9=27  4*9=36   5*9=45  6*9=54   7*9=63   8*9=72   9*9=81  */
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan+"*"+i+"="+dan*i+"  ");
				if(dan==9) {
					System.out.println(dan+"*"+i+"="+dan*i+"  ");
				}
			}
		}
		System.out.println("");
		/*3.	1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램을 작성하시오. 아래 코드에서 반복문을 
			이용하여 합계 연산을 처리하는 코드를 추가하시오.*/
		int sum = 0;
		//for문을 이용하여 반복 합계 연산
		for(int i=1; i<=100; i++) {
			if(i%5 == 0) {
				sum += i;
			}
		}
		System.out.println("5의 배수의 합계는 " + sum);
		
		System.out.println("");
		
		/*4. 1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하시오.*/
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합계는 " + evenSum);
		System.out.println("홀수의 합계는 " + oddSum);
		
		System.out.println();
		
		/*5. 두 개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.*/
		for(int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				if(x+y == 6) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
		
		System.out.println("");
		
		/*6. 이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코드를 작성하시오.
		 *****
		 ****
		 ***
		 **
		 * */
		for(int i=5; i>=1; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		/*7. 이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코드를 작성하시오.
		     * 
		    *** 
		   ***** 
		  ******* 
		 ********* */
		
		
		
		/*8.	주사위의 눈이 6이 나올때까지 계속 반복해서 굴리고, 눈이 6이 되면 지금까지 주사위를 굴린 횟수까지
			출력하는 코드를 작성하시오. (while문으로 반복, 주사위는 Math.random()으로 작성)
		(3)
		(6)
		총 주사위 굴린 횟수는 : 2회*/
		
		
		
	}

}
