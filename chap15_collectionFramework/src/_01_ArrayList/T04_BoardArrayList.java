package _01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T04_BoardArrayList {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		Board board1 = new Board();
		board1.setSubject("황제 김기찬");
		board1.setWritter("김기찬 더 King");
		board1.setPrice(9999000);
		
		Board board2 = new Board("금금찬", "아이유", 90000);
		
		list.add(board1);
		list.add(board2);
		list.add(new Board("King", "kichan", 9999000));
		list.add(new Board("Queen", "suyeon", 99990));
		list.add(new Board("BMW", "yoshimura", 9999));
		
		// 저장된 총 객체의 수
		System.out.println("총 객체의 수 : " + list.size());
		
		// 특정 인덱스의 객체 가져오기
		Board boardRE = list.get(1);
		System.out.println("책 제목 : " + boardRE.getSubject());
		System.out.println("글쓴이 : " + boardRE.getWritter());
		System.out.println("가격 : " + boardRE.getPrice());
		
		for(int i=0; i<5; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 삭제
		list.remove(board1);
		list.remove(2);
		
		for(Board b : list) {
			System.out.println(b);
		}
	}

}
