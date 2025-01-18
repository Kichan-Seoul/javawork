package _02_StringMethod;

// concat(String) : 2개의 문자열을 연결하여 하나의 문자열로 반환
public class T02_concat {

	public static void main(String[] args) {
		String str = "JAVA";
		String str2 = str.concat(" 어렵다");
		System.out.println(str2);
		
		System.out.println(str.concat(" 개싫다"));
		

	}

}
