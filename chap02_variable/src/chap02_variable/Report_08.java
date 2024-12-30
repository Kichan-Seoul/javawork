package chap02_variable;
import java.util.*;
public class Report_08 {

	public static void main(String[] args) {
		// 사용자로 부터 국어, 수학, 컴퓨터의 점수를 입력받아
		// 총점과 평균(소수점2째자리까지(반올림)) 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수 : ");
		int kor = scan.nextInt();
		System.out.println("수학 점수 : ");
		int mth = scan.nextInt();
		System.out.println("컴퓨터 점수 : ");
		int com = scan.nextInt();
		
		int sum = kor + mth + com;
		double avg = sum / 3.0;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);

	}

}
