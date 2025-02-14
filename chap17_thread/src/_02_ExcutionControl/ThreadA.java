package _02_ExcutionControl;

public class ThreadA extends Thread {
	public boolean stop = false; // 스레드 종료시 필드사용
	public boolean work = true; // yield 메소드 호출한 시점을 알기 위해
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA Run");
			} else {
				Thread.yield(); // 작업을 하지 않을 때 다른스레드에게 양보
			}
		}
		System.out.println("ThreadA Ended");
	}
}
