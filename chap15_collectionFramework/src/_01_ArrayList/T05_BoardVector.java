package _01_ArrayList;

import java.util.List;
import java.util.Vector;

public class T05_BoardVector {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("King", "kichan", 9999000));
		list.add(new Board("Queen", "suyeon", 99990));
		list.add(new Board("BMW", "yoshimura", 9999));
		
		list.remove(1);
		
		for(Board b : list) {
			System.out.println(b);
		}
		
	}

}
