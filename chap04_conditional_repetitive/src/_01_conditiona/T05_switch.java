package _01_conditiona;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		/*switch ~ case문
		
		switch(변수) {
		case 1 : 
			변수에 들어있는 값이 1일때 실행;
			break;
		case 2 :
			변수에 들어있는 값이 2일때 실행;
			break;
		default :
			변수에 들어있는 값이 1,2를 제외한 나머지 숫자일떄 실행
		}*/
		int num = 4;
		switch(num) {
		case 1 :
			System.out.println("1입니다");
			break;
		case 2 :
			System.out.println("2입니다");
			break;
		case 3 :
			System.out.println("3입니다");
			break;
			default :
				System.out.println("1,2,3을 제외한 다른 숫자");
		}
		System.out.println("switch문을 빠져나옴");
		
		//break가 없을때
		char ch = 'l';
		switch(ch) {
		case 'k' :
			System.out.println("김씨입니다");
			//break;
		case 'l' :
			System.out.println("이씨입니다");
			//break;
		case 'p' :
			System.out.println("박씨입니다");
			//break;
			default : 
				System.out.println("성이 김, 이, 박씨가 아닙니다");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 달을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울에 태어났군요");
			break;
		case 3: case 4: case 5:
			System.out.println("봄에 태어났군요");
			break;
		case 6: case 7: case 8:
			System.out.println("여름에 태어났군요");
			break;
		case 9: case 10: case 11:
			System.out.println("가을에 태어났군요");
			break;
			default :
				System.out.println("1~12사이의 숫자를 입력하시오.");				
		}
		
		// 뮨) 연산할 두 숫자와 연산자(+,-,*,/,%)를 입력받아 연산한 결과 출력
		System.out.println("계산하고싶은 두 숫자를 입력하시오");
		double numb1 = sc.nextDouble();
		double numb2 = sc.nextDouble();
		System.out.println("연산자를 입력하시오(+, -, *, /, % 중 택1)");
		char method = sc.next().charAt(0);
		
		switch(method) {
		case '+' :
			System.out.println(numb1 + "+" + numb2 + " = " + (numb1 + numb2));
			break;
		case '-' :
			System.out.println(numb1 + "-" + numb2 + " = " + (numb1 - numb2));
			break;
		case '*' :
			System.out.println(numb1 + "*" + numb2 + " = " + (numb1 * numb2));
			break;
		case '/' :
			System.out.println(numb1 + "/" + numb2 + " = " + (numb1 / numb2));
			break;
		case '%' :
			System.out.println(numb1 + "%" + numb2 + " = " + (numb1 % numb2));
			break;
			default :
				System.out.println("옳바른 연산자를 입력하시오.");
		}
		
	}

}
