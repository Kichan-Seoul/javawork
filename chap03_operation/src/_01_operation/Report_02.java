package _01_operation;

import java.util.Scanner;

public class Report_02 {

	public static void main(String[] args) {
		/*1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		
		   ex.
		   이름을 입력하세요 : 아무개
		   성별을 입력하세요(남/여) : 남
		   나이를 입력하세요 : 20
		   키를 입력하세요(cm) : 180.5
		
		   키 180.5cm인 20살 남자 아무개님 반갑습니다^^*/
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("성별을 입력하세요(남/여) : ");
		String gen = scan.next();
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double height = scan.nextDouble();
		System.out.print("키 " +height+"cm인 "+age+"살 "+ gen+" " +name+"님 반갑습니다!\n");
		System.out.println("---------------------------------------------------------");
		
		/*2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		
		   ex.
		   첫 번째 정수 : 23
		   두 번째 정수 : 7
		
		   더하기 결과 : 30
		   빼기 결과 : 16
		   곱하기 결과 : 161
		   나누기 몫 결과 : 3*/
		int num1 = 23;
		int num2 = 7;
		int sum = num1 + num2;
		int minus = num1 = num2;
		System.out.println("첫번째 정수 : "+num1);
		System.out.println("두번째 정수 : "+num2+"\n");
		System.out.println("더하기 결과 : "+sum);
		System.out.println("빼기 결과 : "+minus);
		System.out.println("곱하기 결과 : "+(num1*num2));
		System.out.print("나누기 몫 결과 : "+(num1/num2)+"\n");
		System.out.println("---------------------------------------------------------");
		
		/*3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		   계산 공식 ) 면적 : 가로 * 세로
			     둘레 : (가로 + 세로) * 2
		
		   ex.
		   가로 : 13.5
		   세로 : 41.7
		
		   면적 : 562.95
		   둘레 : 110.4*/
		System.out.println("가로와 세로의 값을 띄어쓰기로 입력하시오 : ");
		double width = scan.nextDouble();
		double height1 = scan.nextDouble();
		double area = width * height1;
		double cir = (width + height1) * 2;
		System.out.printf("면적 : %.2f\n", area);
		System.out.print("둘레 : " + cir + "\n");
		System.out.println("---------------------------------------------------------");
		/*4. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
		
		   ex.
		   문자열을 입력하세요 : apple
		
		   첫 번째 문자 : a
		   두 번째 문자 : p
		   세 번째 문자 : p*/
		System.out.println("문자열을 입력하세요 : ");
		String word = scan.next();
		System.out.println("첫 번재 문자 : "+word.charAt(0));
		System.out.println("두 번째 문자 : "+word.charAt(1));
		System.out.print("세 번째 문자 : "+word.charAt(2)+"\n");
		System.out.println("---------------------------------------------------------");

	}

}
