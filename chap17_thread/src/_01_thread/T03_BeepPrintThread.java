package _01_thread;

import java.awt.Toolkit;
class NumPrint extends Thread {
	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("ring~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class T03_BeepPrintThread {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		NumPrint np = new NumPrint();
		
		np.start();
		
		for (int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
