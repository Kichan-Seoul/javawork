package _01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T03_ArrayList {

	public static void main(String[] args) {
		List list = new ArrayList<>();

		for(int i=0; i<7; i++) {
			list.add(i+1);
		}
		System.out.println("list : " + list);
		
		List list2 = new ArrayList(list.subList(1, 4));
		System.out.println("list2 : " + list2);

		// Collection.sort()
		List list3 = new ArrayList<>();
		list3.add(5);
		list3.add(7);
		list3.add(3);
		list3.add(9);
		list3.add(8);
		Collections.sort(list3); // 반환형 void
		System.out.println("오름차순 정렬 : " + list3);
		
		// contains(객체) : 객체를 포함하고 있는가?
		// containsAll(객체들) : 모든 객체를 포함하고 있는가?
		System.out.println("list3은 list2의 모든 요소를 갖고있는가? " + list3.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "AA");
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		
		// retainAll(객체들) : 객체들에 있는것만 빼고 나머지 삭제
		System.out.println("list에서 list2와 겹치는 부분만 남기고 나머지 삭제 : " + list.retainAll(list2));
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		
		// list2에서 list에 있는 것들만 삭제
		list2.removeAll(list);
		/*for(int i=0; i<list2.size(); i++) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
			}
		}*/
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		
	}

}
