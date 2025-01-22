package _02_ExcutionControl;

public class SumThread extends Thread {
	private int sum;
	
	public int getSum() {
		return sum;
	}
	public void run() {
		for (int i=1; i<=1000; i++) {
			sum += i;
		}
		System.out.println("End");
		
	}
}
