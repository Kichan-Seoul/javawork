package _04_interface2;

public class Inter_main {

	public static void main(String[] args) {
		InterClass ic = new InterClass();
		ic.print(5);
		ic.inMethod();
		System.out.println(ic.PI);
		
		// Inter in = new Inter(); 인터페이스는 객체를 생성할 수 없다
		// ic.PI = 4.5436; 상수라서 변경 불가
		// ic.MAX = 234234; 상수라서 변경 불가

		System.out.println(ic.add(5, 9));
	}

}
