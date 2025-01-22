package _01_thread;

class AutoSaveThread extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("작업파일이 저장되었습니다");
		}
		
	}
}

public class T08_DeamonThread {

	public static void main(String[] args) {
		AutoSaveThread t = new AutoSaveThread();
		t.setDaemon(true);
		t.start();
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("Program Shutdowned");
		
		
		
		
	}

}
