package chap02_casting02;

public class OpCasting_031 {

	public static void main(String[] args) {
		// int보다 작은 자료형은 연산시 무조건 in형
		byte b1 = 10;
		short s1 = 5;
		
		int result = b1 + s1;
		//or byte result = (byte)(b1 + s1);
		
		// 리터럴일때는 연산이 아니라 다음 글자를 의미
		char c1 = 'A'+1;
		System.out.println(c1);
		
		int ch = c1+1; //연산
		char c2 = (char) (c1+1);
		System.out.println(c2);
		System.out.println(ch);
		
		int num1 = 100;
		int num2 = 3;
		int r1 = num1/num2;
		System.out.println(r1);
		
		double r2 = (double)num1/num2;
		System.out.println(r2);

		

	}

}
