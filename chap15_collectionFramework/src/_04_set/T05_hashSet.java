package _04_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T05_hashSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		/*for(int i=0; set.size()<6; i++) {
			set.add((int)(Math.random()*45)+1);
		}
		*/
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		
		for(Integer i : set) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// 정렬이 필요하면 List변경
		List list1 = new ArrayList(set);
		Collections.sort(list1);
		System.out.println(list1);
		
		
		/*
		List<Integer> list1 = new Vector(set);
		List<integer> list1 = new Linked
		*/	
	}

}
