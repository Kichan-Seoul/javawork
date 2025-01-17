package _05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class T03_SnackHashMap {

	public static void main(String[] args) {
		HashMap<String, Snack> map = new HashMap<>();
		
		map.put("새우깡", new Snack("새우ㅇㄹㄴㄹㅇㄹ맛", 500));
		map.put("ㄴㅇㄹㄴㅇㄹ", new Snack("새우ㅋㅁㅁㅁ맛", 5040));
		map.put("새우ㅌㅊㅌㅌ깡", new Snack("새우ㄹㄴㄹ휴ㅠㅠㅠ맛", 5050));
		map.put("새3323ㄱ2ㄱ우깡", new Snack("새우ㅕㅗㅓㅕ쇼ㅕ맛", 5010));
		map.put("새우ㄷㅈㄱㅈㄷㄱㅈㄷㄱㅈㄷ깡", new Snack("새우ㄴㅊㅇㄴㄹㅇ맛", 5100));
		System.out.println(map);
		
		map.put("배빼로", new Snack("단맛", 800));
		System.out.println(map);
		
		map.replace("포테이토칩", new Snack("감칠맛", 400));
		System.out.println(map);
		
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		//Set entry = map.entrySet();
		Iterator<Entry<String, Snack>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Snack> entry = iter.next();
			
			String key =entry.getKey();
			Snack value = entry.getValue();
			System.out.println(key + " - " + value);
		}
	}

}
