package _01_operation;
import java.util.*;
public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항연산자
		// 조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
		int num1 = 10;
		int num2 = 7;
		
		String result = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		System.out.println(result);
		
		char ch1 = num1 < num2 ? '응' : '노';
		System.out.println(ch1);
		
		// num3의 값을 절대값으로 변경하기
		int num3 = -8;
		int d1 = num3 < 0 ? -1 * num3 : num3;
		System.out.println(d1);
		
		//사용자로부터 점수를 입력받아
		//80점 이상이면 합격 그렇지 않으면 불합격을 출력하기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하십시오 : ");
		double score = scan.nextDouble();
		String S1 = score >= 80 ? "합격입니다" : "불합격입니다";
		
		
		S1 = score >= 90 ? "최우수" : 
				score >= 80 ? "우수" : "불합격";
					
		S1 = score > 100 ? "잘못입력했습니다" :
				score >= 90 ? "A" :
				score >= 80 ? "B" :
				score >= 70 ? "C" :
				score >= 60 ? "D" :
				score >= 50 ? "E" : 
				score >= 0 ? "F" : "뒤져라 걍";
										
		System.out.println("당신의 학점은 " + S1);
	}

}
