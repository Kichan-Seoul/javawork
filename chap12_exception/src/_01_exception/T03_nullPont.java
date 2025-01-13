package _01_exception;
// NullPointerException : 객체가 들어가야 되는 자리에 null이 있을 때

public class T03_nullPont {

	public static void main(String[] args) {
		/*		String data = null;
				System.out.println(data.toString());*/
		try {
			String data = null;
			System.out.println(data.toString());
		} catch(NullPointerException ne) {
			System.out.println("객체가 없음");
			//System.out.println("메세지 : " + ne);
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}

}
