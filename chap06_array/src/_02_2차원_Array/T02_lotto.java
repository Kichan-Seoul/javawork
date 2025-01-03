package _02_2차원_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T02_lotto {

	public static void main(String[] args) {
		// for문을 이용하여 45개 1차원 배열에 값을 1~45 넣는다
		// 무작위로 자리바꿈을 해준다
		// 맨앞에서부터 6개만 출력
		
		// 1. 1차원에 45개짜리 배열 만들기
		int lotto[] = new int[45];
		
		// 2. 앞에 1~45까지의 값을 넣어주기
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		// 3. index번호를 무작위로 뽑아서 자리바꿈을 해준다(random 0~44)
		int index = 0;
		for(int i=0; i<100; i++) {
			index = (int)(Math.random()*45);
			int tmp = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = tmp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + ", ");
		}
		System.out.println("");
		
		// 사용자로부터 정수값 5개 배열에 입력받아
		// 오름차순 정렬로 정렬하기
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		for(int i=0; i<numbers.length; i++); {
			numbers[i] = sc.nextInt();
			System.out.println("정수" + (i + 1) + "입력");
			
		}
		Arrays.sort(numbers);
		System.out.println("오름차순 정렬" + Arrays.toString(numbers));
		
		System.out.println("");
		

	}

}
