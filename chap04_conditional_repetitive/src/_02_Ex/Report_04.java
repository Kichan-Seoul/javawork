package _02_Ex;

import java.util.Scanner;

public class Report_04 {

	public static void main(String[] args) {
		/*1. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		   (if문으로)*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 입력하십시오.");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int avg = (kor + eng + math)/3;
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("평균점수 : " + avg + "점으로 합격입니다");
		} else {
			System.out.println("평균점수 : " + avg + "점으로 불합격입니다\n");
		}
		
		/*2. id와 비밀번호를 변수에 저장하고
		   사용자로부터 아이디와 비밀번호를 입력 받아
		   아이디와 비밀번호가 모두 맞으면 "로그인 성공"출력
		   아이디가 틀렸으면 "아이디가 틀렸습니다"출력
		   비밀번호가 틀렸으면 "비밀번호가 틀렸습니다"출력*/
		int id = 2345;
		int password = 1234;
		System.out.println("\nID와 비밀번호를 입력하세요.");
		int uid = scan.nextInt();
		int upassword = scan.nextInt();
		if(uid == id) {
			if(password == upassword) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		} else {
			System.out.println("아이디가 틀렸습니다");
		}
		
		
		/*3. 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 
		   계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.
		
			- BMI = 몸무게 / (키(m) * 키(m))
		
			BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
			BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
			BMI가 30이상일 경우 고도 비만*/
		System.out.println("\n키와 몸무게를 입력하시오");
		double height = scan.nextDouble();
		double weight = scan.nextDouble();
		double bmi = weight / ((height * height) * 0.0001);
		if(bmi < 18.5) {
			System.out.println("저체중입니다");
		} else if(bmi >=18.5 && bmi <23) {
			System.out.println("정상체중입니다");
		} else if(bmi >=23 && bmi <25) {
			System.out.println("과체중입니다");
		} else if(bmi >=25 && bmi <30) {
			System.out.println("비만입니다");
		} else if(bmi >=30) {
			System.out.println("고도비만입니다");
		}
		
		/*4. 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력
		   평가 비율은 중간고사 20%, 
		                  기말고사 30%, 
		                  과제 30%, 
		                  출석 20%로 이루어져 있고 
		   이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산.
		   70점 이상일 경우 Pass, 
		   70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력
		
			ex) 1.
			중간고사 점수 : 80
			기말고사 점수 : 30
			과제 점수 : 70
			출석 회수 : 18
			============= 결과 ============
			중간 고사 점수(20) : 16.0
			기말 고사 점수(30) : 9.0
			과제 점수(30) : 18.0
			출석 점수(20) : 18.0
			총점 : 61.0
			Fail [점수 미달]
		
			ex) 2.
			중간고사 점수 : 80
			기말고사 점수 : 90
			과제 점수 : 50
			출석 회수 : 15
			============= 결과 ============
			중간 고사 점수(20) : 16.0
			기말 고사 점수(30) : 27.0
			과제 점수(30) : 15.0
			출석 점수(20) : 15.0
			총점 : 73.0
			Pass
		
			ex) 3.
			중간고사 점수 : 100
			기말고사 점수 : 80
			과제 점수 : 40
			출석 회수 : 10
			============= 결과 ============
			Fail [출석 횟수 부족(10/20)]*/
		System.out.println("\n다음 항목들을 입력하시오.");
		System.out.println("중간고사 : ");
		int middletest = scan.nextInt();
		System.out.println("기말고사 : ");
		int finaltest = scan.nextInt();
		System.out.println("과제 : ");
		int mission = scan.nextInt();
		System.out.println("출석 횟수 : ");
		int check = scan.nextInt();
		 
		double middleH = middletest * 0.2;
		double finalH = finaltest * 0.3;
		double missionH = mission * 0.3;
		double checkH = check;
		double total = middleH + finalH + missionH + checkH;
		
		System.out.println("============ 결과 ============" + 
							"\n중간고사 점수(20) : " + middleH + 
							"\n기말고사 점수(30) : " + finalH +
							"\n과제 점수(30) : " + missionH +
							"\n출석 횟수 : " + checkH +
							"\n총점 : " + total);
		if(total >= 70) {
			if(check > 20*0.7) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail [출석 횟수 부족{" + check + "/20)]");
			}
		} else {
			System.out.println("Fail [점수 미달]");
		}
	}

}