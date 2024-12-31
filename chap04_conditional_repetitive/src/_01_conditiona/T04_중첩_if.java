package _01_conditiona;

public class T04_중첩_if {

	public static void main(String[] args) {
		/*중첩if문
		if(조건식1) {
			if(조건식2) {
				//조건식2가 참일때 실행할 구문
			} else {
				//조건식2가 거짓일때 실행할 구문
			}
		} else {
			//조건식1이 거짓일때 실행할 구문
		}*/
		
		int num1 = 0;
		if(num1 >100) { // 100보다 큰 모든 수
			if(num1 > 200) { //200보다 큰 모든 수
				System.out.println("200보다 큰 숫자");
			} else { // 200보다 작은 수면서 100보다 커야함
				System.out.println("100보다 크고 200보다 작은 숫자");
			}
		} else { //100보다 작은 수
			if(num1 > 0) { // 1~100
				System.out.println("100보다 작고 0보다 큰 숫자");
			} else if(num1 == 0) {
				System.out.println("0");
			} else {
				System.out.println("음수");
			}
		}
		
	}

}
