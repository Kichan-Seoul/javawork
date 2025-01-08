package _02_static;

public class T01_static_main {

	public static void main(String[] args) {
		
		T01_static st1 = new T01_static();
		st1.printIn();
		st1.printSt();
		st1.num = 10;
		st1.numSt = 100;
		System.out.println(st1.num);
		System.out.println(st1.numSt);
		st1.printIn();
		st1.printSt();
		
		T01_static st2 = new T01_static();
		System.out.println(st2.num);
		System.out.println(st2.numSt);
		st2.printIn();
		st2.printSt();
		
		// 정적 필드는 객체를 생성하지 않고도 사용가능
		System.out.println(T01_static.numSt);
		System.out.println(T01_static.nameSt);
		T01_static.printSt();
	}

}
