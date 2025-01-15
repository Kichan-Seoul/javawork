package _05_Wrapper;
/*
Boxing과  ubBoxing
Boxing : 기본자료형을 참조자료형으로 변환
unBoxing : 참조자료형을 기본자료혀으로 변환
*/
public class T01_Wrapper {

	public static void main(String[] args) {
		Integer i1 = new Integer(3); // deprecated : 앞으로 없어질 예정이니 되도록이면 쓰지 말아라
		Integer i2 = Integer.valueOf(3); 
		 
		// autoUnBoxing
		int num = Integer.parseInt("100");
		int num2 = Integer.valueOf("100");
		System.out.println(num);
		System.out.println(num2);
		 
		// boxing
		int num3 = 10;
		Integer num4 = Integer.valueOf(num3);
		System.out.println(num4);
		
		String str = "10";
		Integer num5 = Integer.valueOf(str);
		System.out.println(num5);
		
		double dou = 12.345;
		Double dou2 = Double.valueOf(dou);
		System.out.println(dou2);
		
		
	}

}
