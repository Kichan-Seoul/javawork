package _09_ex;

import java.util.Comparator;

public abstract class DescendingPrice implements Comparator<fruit> {
	
	@Override
	public int compare(fruit f1, fruit f2) {
		return Integer.compare(f2.getPrice(), f1.getPrice());
	}
	
}
