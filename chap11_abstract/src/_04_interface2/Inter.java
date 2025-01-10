package _04_interface2;

public interface Inter {
	// 상수만 사용가능
	public static final double PI = 3.14;
	int MAX = 100;
	// 컴파일시 public static final 가 자동으로 붙음
	
	// 추상메소드만 사용가능
	public abstract void print(int a);
	public abstract void inMethod();
	String inStr(String name); // 컴파일시 puiblic abstract 자동으로 붙여줌
	
}
