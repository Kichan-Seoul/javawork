package _05_map;

import java.util.HashMap;
import java.util.Scanner;

public class T02_HashMap {

	public static void main(String[] args) {
		// 키 = id, 값 = pw (3개를 hashMap 넣기)
		HashMap<String, String> map = new HashMap<>();
		map.put("kimkc30", "1q2w3e4r");
		map.put("qwer40", "2w3e4r5t");
		map.put("wert90", "5t6y7u8i");
		
		// 사용자로부터 id와 pw를 받아서
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력하십시오 : ");
		String id = sc.next();
		System.out.println("Password를 입력하싶시오");
		String pw = sc.next();
		
		if (!map.containsKey(id)) {
			System.out.println("존재하지 않는 ID 입니다");
		} else {
			if (map.get(id).equals(pw)) {
				System.out.println("Login Succeed!");
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}
				
	}

}
