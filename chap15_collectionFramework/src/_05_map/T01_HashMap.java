package _05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 넣기 : put(key, value)
		map.put("홍길동", 87);
		map.put("븅신", 9);
		map.put("장애련", 3);
		map.put("천재김기찬", 100);
		System.out.println("총 entry 수 : " + map.size());
		
		// 객체 얻어오기 : get(key)
		System.out.println(map.get("장애련"));
		
		// 객체 삭제 : remove(key)
		//map.remove("븅신");
		//System.out.println("븅신 삭제 후 : " + map);
		
		// 동일한 키로 값 넣기(기존의값 변경)
		// 없는 키면 삽임, 있는 키편 변경
		map.put("홍길동", 30);
		System.out.println(map);
		map.put("홍길동", 9);
		System.out.println(map);
		System.out.println();
	
		// 객체 하나씩 출력 하려면
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			int value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
	}

}
