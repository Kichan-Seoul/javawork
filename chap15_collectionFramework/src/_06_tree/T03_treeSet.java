package _06_tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class T03_treeSet {

	public static void main(String[] args) {
		Integer[] score = {100 ,32, 43, 87, 45, 65};
		
		TreeSet<Integer> setScores = new TreeSet<>();
		for(Integer i : score) {
			setScores.add(i);
		}
		
		System.out.println(setScores);
		
		NavigableSet<Integer> result = setScores.headSet(88, false); // false -> 88 not include, true -> 88 include
		System.out.println("Score 88 미만 점수 검색" + result);
		
		NavigableSet<Integer> result2 = setScores.headSet(88, true); 
		System.out.println("Score 88 이하 점수 검색" + result2);
		
		NavigableSet<Integer> result3 = setScores.tailSet(88, false); 
		System.out.println("Score 88 초과 점수 검색" + result3);
		
		NavigableSet<Integer> result4 = setScores.tailSet(88, true); 
		System.out.println("Score 88 이상 점수 검색" + result4);
		
		
		
		
	}

}
