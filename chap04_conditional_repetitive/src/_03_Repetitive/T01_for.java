package _03_Repetitive;

public class T01_for {

	public static void main(String[] args) {
		/*반복문 : 원하는 갯수만큼(또는 조건이 맞을때까지) 반복하여 실행하고자 할 때
		1.	for : 원하는 갯수 만큼 반복 실행
			for(초기식; 조건식; 증감식) {
				실행문
			}
		2.	while : 조건이 맞을 때까지 반복 실행
		3.	do~while*/

		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		
		System.out.println("-----------");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("어서오세요");
		}
		
		System.out.println("-----------");
		
		for(int i = 1; i<=10; i++) {
			System.out.println("뒤져병1신아");
		}
		
		for(int i = 10; i>=1; i--) {
			System.out.println(i + ".감소");
		}
		
		System.out.println("-----------");
		
		for(int i = 1; i<=10; i+=2) {
			System.out.println(i + ".i값 출력");
		}
		
		System.out.println("-----------");
		
		// 1~100까지의 합계 구하기
		int sum = 0;
		for(int i = 1; i<=45; i++) {
			sum += i;
			//System.out.println(sum); 
		}
		System.out.println("합계 : " + sum);
		
	}

}
