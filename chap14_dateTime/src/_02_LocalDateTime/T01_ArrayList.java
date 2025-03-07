package _02_LocalDateTime;

import java.util.ArrayList;
import java.util.List;

/*
List 계열
 - 특징 : 순서가 있다
 		 중복저장 가능
1. ArrayList : 싱글스레드에서 사용
	- 제네릭
		ArrayList<자료형> -> 모든 자료형을 받을 수 있도록 만듬 -> 사용할 때 자료형을 넣어주면 됨
	- 초기배열 10개 : 10개를 초과하여 넣으면 배수만큼 더 만들어 줌
	- 배열 지정할 수 있음 : new ArrayList<>(배열의 개수);
	- 부모 자료형으로 형변환 하여 많이 사용한다
		- List<자료형> 변수명 = new ArrayList<>();
2. Vector : ArrayList와 동일하게 사용(멀티스레드에서 사용)
3. LinkedList
*/

public class T01_ArrayList {

	public static void main(String[] args) {
		//ArrayList<Object> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		//배열에 넣을때 add() 
		list.add("KICHAN");
		list.add("KIM");
		list.add("IS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println(list);
		
		list.add(2, "KING");
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i); // 얻어올때 : get(index번호) 사용. list[index] -> 안됨
			System.out.println(str);
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println(list.get(2));
		
		// 삭제
		// Object remove(index)
		// boolean remove(객체)
		// clear() : 모두 삭제
		list.remove(2);
		System.out.println("index2 삭제 후 ");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("삭제한 객체 : " + list.remove(1));
		
		list.clear();
		System.out.println("총 객체수 : " + list.size());
	}

}
