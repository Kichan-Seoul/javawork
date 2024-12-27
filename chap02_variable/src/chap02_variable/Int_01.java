package chap02_variable;

public class Int_01 {

	public static void main(String[] args) {
		/*
		 * 변수 : 저장공간 
		 * 
		 * int : 정수를 저장하는 공간(4byte(32bit)) 
		 * double : 실수를 저장하는 공간(8byte)
		 * char : 문자1개(2byte, 유니코드)
		 * String : 문자열
		 */
		
		// 컴퓨터 언어는 2진수로 되어 있음 (0,1)
		// 1bit : 1개(0 or 1)
		// 1byte : 8bit
		
		/*자료형 변수명;
		변수명 = 값;*/

		int number;
		number = 3;
		
		System.out.println(number);
		
		number = 4;
		//변수는 변환이 가능하다 -> 기존의 저장공간에 덮어쓰기
		System.out.println(number);
		
		int number2 = 5;
		//새로운 저장공간을 하나 더 만든 것
		//한줄로 써도 된다
		System.out.println(number2);
		System.out.println(number);
		
		/*숙제
		 * int 저장공간을 2개 만들기
		 * 각각 5와 3을 넣기
		 * 저장공간의 각 값들을 4칙연산하여 출력하기
		*/
		
		int sum = number+number2;
		System.out.println(number + "+" + number2 + "=" + sum);
		
	}

}
