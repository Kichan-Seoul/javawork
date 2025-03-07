package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class T02_HashSet {

	public static void main(String[] args) {
		//HashSet<Integer> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("d");
		
		System.out.println("set의 size : " + set2.size());
		
		// set의 객체 얻어오기
		// 순서가 없기 때문에 get(index)로 가져올 수 없다
		// Iterator 사용
		Iterator<String> iterator = set2.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		System.out.println();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("b")) {
				iterator.remove();
			}
		}
		
		System.out.println(set2.iterator());
		
	}

}
