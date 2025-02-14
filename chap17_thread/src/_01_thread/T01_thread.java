package _01_thread;
class Thread1 extends Thread {
	@Override
	public void run() {
		setName("First Thread"); // 스레드 이름 변경
		for(int i=1; i<=5; i++) {
			System.out.println(getName()); // 조상인 스레드의 이름 호출
		}
	}
}
class Thread2 implements Runnable {

	@Override
	public void run() {
		//setName() : Thread클래스에 있는 메소드. setName()으로는 안됨
		//currenThread() : 현재 실행되고 있는 스레드 얻어오기
		Thread.currentThread().setName("Second Thread");
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
				
	}
	
}
public class T01_thread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		
		Runnable r  = new Thread2();
		Thread t2 = new Thread(r); // Thread(Runnable r)
		
		Thread t3 = new Thread(new Thread2()); // new Thread2()객체가 Runnable인 부모타입으로 자동형변환이 되었기 떄문
	
		t1.start(); // t1스레드 실행
		t2.start();
	
	}

}
