package _02_StringMethod;

// startWith(String) : 문자로 시작하는지 boolean으로 반환
// endWith(String) : 문자로 끝나는지 boolean으로 반환

public class T04_endWith {

	public static void main(String[] args) {
		String str = "javahtmlcssoracle";
		boolean a = str.startsWith("java");
		boolean b = str.endsWith("oracle");
		
		System.out.println(a);
		System.out.println(b);

	}

}
