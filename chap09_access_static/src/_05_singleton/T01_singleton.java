package _05_singleton;
/*
싱글톤 : 객체를 오로지 한개만 만들도록 보장하는 기법
싱글톤을 사용하는 이유 : 최초 호출시 만들어 뒀던 객체를 재사용하는 패턴(계속 생성하고 삭제하지 않아도 된다)
장점 : 메모리 낭비를 방지한다
단점 : 1.의존성이 높아진다 - private 생성자 때문에 상속이 어렵다
	  2. 테스트하기 힘들다
*/
public class T01_singleton {
	static T01_singleton singleton = new T01_singleton();
	//다른 클래스에서 객체생성을 못하도록 막아 놓음
	private T01_singleton() {
		System.out.println("객체 생성");
	}
	
	public static T01_singleton getSingleton() {
		return singleton;
	}
	
}
