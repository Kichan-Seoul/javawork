package _01_exception;

// finally : 예외발생과 상관없이 무조건 실행
// try-catch문 밖에 있는 프로그램도 예외발생과 상관없이 무조건 실행
//	- 위 두개의 차이점
//		return이 있을 때(원래 return을 만나면 메소드 밖으로 빠져나감)
//						: finally는 메소드 밖으로 빠져나오기 전에 무조건 실행
//						 try-catch문 밖에 있는 프로그램은 실행 하지않고 메소드를 빠져나옴

public class T10_finally {

	public static void main(String[] args) {
		int[] num = {1,2,3};
		try {
			System.out.println(num[0]);
			System.out.println(num[1]);
			return;
		} catch(Exception e) {
			System.out.println("index의 범위를 벗어남");
		} finally {
			System.out.println("예외가 발생해도 실행 안해도 실행 무조건 실행");
		}
		
		System.out.println("무조건 실행");
		
	}

}
