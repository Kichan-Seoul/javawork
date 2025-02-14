package _01_thread;

public class T04_SingleThread {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<500; i++) {
			System.out.print("KICHAN");
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println();
		
		System.out.println("소요시간 : " + (endTime-startTime));

		for(int i=0; i<500; i++) {
			System.out.print("KING");
		}
		endTime = System.currentTimeMillis();
		
		System.out.println();
		
		System.out.println("소요시간 : " + (endTime-startTime));
	}

}
