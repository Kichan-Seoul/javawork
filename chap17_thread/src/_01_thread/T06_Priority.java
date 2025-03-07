package _01_thread;
class Thread3 extends Thread {
	public void run() {
		for (int i=0; i<300; i++) {
			System.out.println("KICHAN");
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thread4 extends Thread {
	public void run() {
		for (int i=0; i<300; i++) {
			System.out.println("KING");
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class T06_Priority {

	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
		System.out.println("우선순위가 가장 높은 값 : " + Thread.MAX_PRIORITY); // 10:  우선순위가 가장 높음
		System.out.println("우선순위가 가장 낮은 값 : " + Thread.MIN_PRIORITY); // 1:  우선순위가 가장 낮음
		System.out.println("우선순위 default 값 : " + Thread.NORM_PRIORITY); // 
		
		System.out.println();
		
		t3.setPriority(10);
		t4.setPriority(1);
		System.out.println("우선순위(KICHAN) : " + t3.getPriority());
		System.out.println("우선순위(KING) : " + t4.getPriority());

		t3.start();
		t4.start();
		
		
	}

}
