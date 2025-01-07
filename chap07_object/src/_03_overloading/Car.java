package _03_overloading;
/*오버로딩의 조건
1. 메소드 이름이 같아야 한다
2. 매개변수는 달라야 한다
	- 개수가 다르던지
	- 자료혀잉 다르던지
3. 반환형은 상관없음
*/
public class Car {
	int add() {
		return 0;
	}
	
	int add(int x) {
		return x;
	}
	
	int add(int x, int y) {
		return x+y;
	}
	
	String add(String name) {
		return "이름 : " + name;	
	}
	
	double add(int x, double y) {
		return x+y;
	}
	
}
