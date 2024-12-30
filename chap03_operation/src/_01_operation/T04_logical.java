package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		// 논리곱(and)과 논리합(or)
		/*
		 x y 논리곱(&&) 논리합(||)
		 0 0	0		0
		 0 1	0		1
		 1 0	0		1
		 1 1	1		1
		 */
		
		int num1 = 10;
		int num2 = 20;
		boolean result = num1==num2 && num2>num1; //논리곱, 논리합 을 할때는 단순한 숫자가 아닌 참,거짓 명제가 들어가야한다.
		System.out.println(result);
		result = num1==num2 || num2>num1;
		System.out.println(result);
		System.err.println("------------------------------------------------------------------");
		
		// ! : not
		boolean b1 = num1 >= num2;
		System.out.println(b1);
		System.out.println(!b1);
		System.out.println(!!b1);
		
		// A : 65~90, a : 97
		char ch1 = 'K';
		System.out.println(ch1);
		System.out.println("대문자인가? " + (ch1>='A'&&ch1<='Z'));
		System.out.println("소문자인가? " + (ch1>='a'&&ch1<='z'));
		
	}

}
