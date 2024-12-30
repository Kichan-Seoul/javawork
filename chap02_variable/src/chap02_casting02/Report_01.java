package chap02_casting02;

import java.util.Scanner; //ctrl+shift+o

public class Report_01 {
	
	public static void main(String[] args) {
		/*	1. 문자하나를 입력받아 그 문자의 유니코드를 출력하기
		
			3.  int iNum1 = 10;
			    int iNum2 = 4;
			    float fNum = 3.0f;
			    double dNum = 2.5;
			    char ch = 'K'; 
		
			   3.1  iNum1 / iNum2의 몫 출력
			   3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
			   3.3  iNum1의 값이 10.0으로 출력되게 하기
			   3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
			   3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
			   3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
			   3.7  ch변수의 유니코드 출력하기
			   3.8  ch변수에 1을 더해 L 이 출력되게 하시오*/
		Scanner s1 = new Scanner(System.in);
		System.out.println("문자를 1글자 입력하십시오 : ");
		char word = s1.next().charAt(0);
		System.out.println(word + "의 유니코드 : "+(int)word);
		//or int wordUni = word;
		
		//3
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'K';
		//3.1
		System.out.println(iNum1/iNum2);
		//3.2
		int i2 = (int) (iNum2*dNum);
		System.out.println(i2);
		//3.3
		double d1 = iNum1;
		System.out.println(d1);
		//3.4
		double d2 = (double)iNum1/iNum2;
		System.out.println(d2);
		//3.5
		int i3 = (int)(iNum1/fNum);
		System.out.println(i3);
		//3.6
		double d3 = (double)(iNum1/fNum);
		System.out.println(d3);
		//3.7
		int i4 = ch;
		System.out.println(i4);
		//3.8
		char ch2 = (char) (i4+1);
		System.out.println(ch2);
		
	}
}