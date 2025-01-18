package _03_StringBuffer_Builder;
/*
String(불변성) : 한번 객체가 생성되면 덮어쓰기가 불가능 (무조건 새로 생성 해야함) - 변하지 않는 문자열을 사용할 떄

StringBuffer : 추가, 삭제, 수정할 수 있다. 동기화를 지원함 - 자주 변경되는 문자열을 사용할 떄, 멀티스레드 사용시

StringBuilder : 추가, 삭제, 수정할 수 있다. - 단일스레드 사용시 -> StringBuffer보다 빠르다

StringBuffer와 StringBuilder의 메소드
	append() : 문자열을 맨 뒤에 추가
	insert() : 지정된 위치에 문자열을 삽입
	delete() : 특정 범위의 문자열을 삭제
	reverse() : 문자열을 반대로 
*/
public class T01_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Kichan");
		StringBuffer sb2 = new StringBuffer("Kichan");
		
		// equals()는 오버라이딩 되어있지 않음
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));
		
		System.out.println();
		
		// toString()은 오버라이딩 되어있음
		System.out.println(sb1);
		
		// append()
		sb1.append(" Kim");
		System.out.println(sb1.append(" is king? "));
		sb1.append(true);
		System.out.println(sb1);

		// delete()
		sb1.delete(6, 10);
		System.out.println(sb1);
		sb1.deleteCharAt(14);
		System.out.println(sb1);
		
		// index위치부터 끝까지 삭제
		sb2.delete(3, sb2.length());
		System.out.println(sb2);
		
		// insert()
		sb1.insert(0, "the real man ");
		System.out.println(sb1);
		sb1.insert(32, " FACT");
		System.out.println(sb1);
		
		// replace()
		sb1.replace(23, 27, "EMPEROR");
		System.out.println(sb1);
		
		// reverse()
		System.out.println(sb1.reverse());
		
		// capacity() : StringBuffer의 크기
		//				객체가 생성될 때 기본버퍼의 크기는 16Byte + 문자크기
		StringBuffer sb3 = new StringBuffer();
		System.out.println("sb3 버퍼의 크기 : " + sb3.capacity());
		StringBuffer sb4 = new StringBuffer("a");
		System.out.println("sb4 버퍼의 크기 : " + sb4.capacity());
		StringBuffer sb5 = new StringBuffer("찬");
		System.out.println("sb5 버퍼의 크기 : " + sb5.capacity());
		
		// 버퍼의 크기 지정
		StringBuffer sb6 = new StringBuffer(32);
		System.out.println("sb6 버퍼의 크기 : " + sb6.capacity());
		
	}

}
