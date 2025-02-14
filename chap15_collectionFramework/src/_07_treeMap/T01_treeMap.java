package _07_treeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class T01_treeMap {

	public static void main(String[] args) {
		// 키를 기준으로 정렬
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("base", null);
		treeMap.put("apple", null);
		treeMap.put("cherry", null);
		treeMap.put("description", null);
		treeMap.put("ever", null);
		treeMap.put("guess", null);
		
		System.out.println("c~f 사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()); {
			System.out.println(entry.getKey() + "=" + entry.getValue() + "페이지");
		}
		
	}

}
