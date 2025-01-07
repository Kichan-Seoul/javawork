package _05_constructor;
// 생성자
// 객체가 만들어 질 때 딱 한번 호출
public class Tv2 {
	// 속성
	String company = "LG";
	String model = "울트라 FULL HD";
	int inch = 65;
	
	Tv2(String company1, String model1, int inch1) {
		company = company1;
		model = model1;
		inch = inch1;
	}
	
}
