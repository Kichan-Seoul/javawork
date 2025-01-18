package _06_tree;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T02_treeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		while (set.size() < 6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);

		Scanner sc = new Scanner(System.in);
		System.out.println("금액 입력");
		
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			set.clear();
			while(set.size() < 6) {
				set.add((int)(Math.random()*45)+1);
			}
			System.out.println("로또번호" + (i+1) + ". " + set);
		}
	}

}
