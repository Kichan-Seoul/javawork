package _02_StringMethod;

// 오버로딩 되어있음. 찾는 문자(문자열)가 없으면 -1 반환

// indexOf() : 앞에서부터 살펴봄
// indexOf(char) : 글자의 index번호 반환, 없으면 -1 반환
// indexOf(char, fromIndex) : fromIndex번호부터 글자가 있는지 확인 후 index번호 반환
// indexOf(String) : 문자열의 시작 index번호 반환
// indexOf(String, fromIndex) : fromIndex번호부터 문자열이 있는지 확인 후 index번호 반환

// lastIndexOf() : 뒤에서부터 살펴봄

public class T06_indexOf {

	public static void main(String[] args) {
		String str = "java programming vaja";
		
		int a = str.indexOf('a');
		System.out.println(a);
		
		a = str.indexOf('a', 5);
		System.out.println(a);
		
		a = str.indexOf("gra");
		System.out.println(a);
		
		a = str.indexOf("va", 5);
		System.out.println(a);
		
		if(str.indexOf("java") == -1) {
			System.out.println("자바 프로그램이 아닙니다");
		} else {
			System.out.println("자바 프로그램입니다");
		}
		
		a = str.lastIndexOf("j");
		System.out.println(a);
		
		
		
	}

}
