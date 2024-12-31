package _01_operation;
import java.util.*;
public class Report_03 {

	public static void main(String[] args) {
		/*1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력*/
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하십시오 : ");
		int num1 = scan.nextInt();
		String s1 = num1 > 0 ? "양수" : "음수";
		System.out.println("이 숫자는 " + s1 +"입니다");
		
		/*2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력*/
		System.out.println("숫자를 입력하십시오 : ");
		int num2 = scan.nextInt();
		String s2 = num2 > 0 ? "양수" :
					num2 < 0 ? "음수" : "0";
		System.out.println("이 숫자는 "+s2+"입니다");
		
		/*3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력*/
		System.out.println("숫자를 입력하십시오 : ");
		int num3 = scan.nextInt();
		String ii4 = num3 % 2 == 0 ? "짝수" : "홀수";
		System.out.println(ii4);
		
		/*4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
		   사용자로부터 인원수와 사탕의 갯수를 입력받아
		   1인당 동일하게 나눠가진 사탕 개수와
		   나눠주고 남은 사탕 갯수를 출력하기*/
		   System.out.println("\n인원수를 입력하십시오 : ");
		   int people = scan.nextInt();
		   System.out.println("사탕의 개수를 입력하십시오 : ");
		   int candy = scan.nextInt();
		   int CperP = candy / people;
		   int restC = candy % people;
		   System.out.println("인원 수 : "+people+"명\n사탕 수 : "
				   						+candy+"개\n1인당 배분할 사탕 수 : "
				   						+CperP+"개\n남은 사탕 수 : "
				   						+restC+"개\n");
		   
		/*5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
				이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.
				
				ex.
				이름 : 이준기
				학년(숫자만) : 2
				반(숫자만) : 7
				번호(숫자만) : 3
				성별(M/F) : M
				성적(소수점 둘째 짜리까지) : 97.35
				
				2학년 7반 3번 이준기 남학생의 성적은 97.35이다.*/
		System.out.println("다음 항목을 입력하십시오.");
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("학년(숫자만) : ");
		int grade = scan.nextInt();
		System.out.println("반(숫자만) : ");
		int sep = scan.nextInt();
		System.out.println("번호(숫자만) : ");
		int number = scan.nextInt();
		System.out.println("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		String g1 = gender == 'M' ? "남학생" : "여학생";
		System.out.println("성적(소수점 둘째 자리까지) : ");
		double score = scan.nextDouble();
		System.out.println(grade + "학년 " + sep + "반 "+number+"번 " + name +g1+"의 성적은 "+score+"점 입니다\n");
		/*System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다\n");*/
		
		/*6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
		    14세~19세 이하이면 청소년
		    20세 이상이면 성인으로 출력하시오*/
		System.out.println("나이를 입력하십시오 : ");
		int age = scan.nextInt();
		String ssd = age >= 20 ? "성인" :
					age >= 14 ? "청소년" :
					age >= 1 ? "어린이" : "잘못입력했다";
		System.out.println("당신은 "+ssd+"입니다\n");
		
		/*7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.*/
		System.out.println("국어, 영어, 수학 점수를 띄어쓰기로 차례대로 입력하시오");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		String sssd = kor >= 40 && eng >= 40 && math >= 40 && (kor+eng+math)/3 >=60 ? "합격" : "불합격";
		System.out.println("당신은 "+sssd+"입니다\n");

		/*8. 주민번호를 입력받아 남자인지 여자인지 출력하기
				
				ex.
				주민번호를 입력하세요(- 포함) : 123456-3123456*/
		System.out.println("주민번호를 입력하시오 : ");
		char gen = scan.next().charAt(7);
		if(gen=='1'||gen=='3')
			System.out.println("남성\n");
		else if(gen=='2'||gen=='4')
			System.out.println("여성\n");
		
		
		/*9.  사용자로부터 두 개를 입력 받고(num1, num2에 저장)
		    또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		    아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함)*/
		System.out.println("숫자 두개를 작은 순서대로 띄어쓰기로 입력하십시오.");
		int numb1 = scan.nextInt();
		int numb2 = scan.nextInt();
		System.out.println("숫자 한개를 입력하십시오.");
		int numb3 = scan.nextInt();
		boolean b12 = numb3 <= numb1 || numb3 > numb1;
		System.out.println(b12+"\n");
		
							
		/*10. 사용자로부터 3개의 수를 키보드로 입력 받아 
		입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요*/
		System.out.println("숫자 3개를 띄어쓰기로 입력하시오.");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		boolean sibal = (n1==n2)&&(n2==n3);
		System.out.println(sibal);
		
		
	}

}
