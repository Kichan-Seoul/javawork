package _02_StringMethod;

// replace(기존문자, 바꿀문자) : 기존문자를 바꿀문자로 바꾸기
// replaceAll(기존문자, 바꿀문자) : 기존문자를 바꿀문자로 바꾸기(정규표현식 때)
// replaceFirst(기존문자, 바꿀문자) : 맨 처음 나오는 문자열만 바꿀 문자로 바꾼다

public class T07_replace {

	public static void main(String[] args) {
		String str = "javaprogramming java awsjava dajava";
		
		String a = str.replace("java", "sex");
		System.out.println(a);
		
		String b = "javapro jeava awsjava dajva";
		System.out.println(str.replace("java", "자바"));
		System.out.println(str.replaceAll("java", "자바"));
		
		System.out.println(b.replaceFirst("java", "자바"));
	}

}
