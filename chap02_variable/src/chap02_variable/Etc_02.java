package chap02_variable;

public class Etc_02 {

	public static void main(String[] args) {
		double pi = 3.14;
		char ch = 'A';	//char은 1글자만 넣을 수 있음. 반드시 외따음표
		String str = "abcdef";
		boolean bool = true;
		boolean bool2 = false;
		String str2 = "a";	//String은 문자를 안넣어도 되고, 한글자만 넣어도 됨
		char ch2 = ' ';	//spacebar의 유니코드가 들어감. '' -> 오류
		
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);
		System.out.println(bool2);
		System.out.println(str2);
		System.out.println(ch2);
		

	}

}
