package _02_StringMethod;

// contains(String) : 문자열이 포함되어 있는지 boolean으로 반환

public class T03_contains {

	public static void main(String[] args) {
		String str = "java programing";
		boolean b = str.contains("pro");

		if(b) {
			System.out.println("Pro");
		} else {
			System.out.println("Amatuar");
		}

	}

}
