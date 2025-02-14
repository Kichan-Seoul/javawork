package _09_ex;

import java.util.TreeSet;

public class Comparator_main {

	public static void main(String[] args) {
		TreeSet<fruit> treeSet = new TreeSet<>();
		
		treeSet.add(new fruit("apple", 1200));
		treeSet.add(new fruit("orange", 1600));
		treeSet.add(new fruit("banana", 800));
		
		for (fruit f : treeSet) {
			System.out.println(f);
		}

	}

}
