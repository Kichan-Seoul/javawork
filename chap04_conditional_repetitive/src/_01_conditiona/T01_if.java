package _01_conditiona;

public class T01_if {

	public static void main(String[] args) {
		// 조건문 : if문과 switch~case문
		/*if문
		if(조건식) { 
		중괄호는 참일 때 실행하는 구문이 1줄이면 생략 가능
		참일 떄 실행하는 구문이 1줄 이상이면 반드시 중괄호를 넣어준다
			조건식이 참일 때 실행
		}*/
		
		int num = 100;
		if(num == 100) { //중괄호 생략 가능
			System.out.println("100점입니다.");
		}
		if(num > 80) { //2줄 이상이기 때문에 중괄호를 넣어야한다
			System.out.println("축하합니다");
			System.out.println("합격입니다");			
		} //하지만 헷갈릴수도 있기 때매 한줄이어도 중괄호를 쓰는게 좋다.
	}

}
