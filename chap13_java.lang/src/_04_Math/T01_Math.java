package _04_Math;

// Math클래스 : 수학에서 쓰는것을 메소드로 만들어 놓음 - 클래스안의 모든 필드와 메소드는 static이 붙어있음

public class T01_Math {

	public static void main(String[] args) {
		// 절대값 : abs
		System.out.println("-15의 절대값 : " + Math.abs(-15));
		System.out.println("-15.2342의 절대값 : " + Math.abs(-15.2342));
		
		// 소수점이하 무조건 올림 : ceil()
		System.out.println("12.423의 올림 : " + Math.ceil(12.523));
		System.out.println("-12.423의 올림 : " + Math.ceil(-12.423));
		
		// 소수점이하 무조건 내림 : floor()
		System.out.println("23.7324의 내림 : " + Math.floor(23.7324));
		System.out.println("-23.7324의 내림 : " + Math.floor(-23.7324));
		
		// 가장 가까운 정수로 반환 : rint()
		System.out.println("45.123의 반올림 : " + Math.rint(45.123));
		System.out.println("-45.123의 반올림 : " + Math.rint(-45.123));
		
		// 소수점 2째자리까지 얻기
		double value = 12.34567;
		double value2 = value * 100;
		System.out.println(Math.round(value2)*0.01);
		
		// 두 수중 큰 수 or 작은 수 : max(), min()
		System.out.println("7,5중 큰수 : " + Math.max(7, 5));
		System.out.println("7,5중 작은수 : " + Math.min(7, 5));
		System.out.println((char)Math.max('a', 'z'));
		
		// 제곱연산 : pow()
		System.out.println("5의 3승 : " + (int)Math.pow(5, 3));
		System.out.println("1024의 3승 : " + (int)Math.pow(1024, 3));
		
		// 제곱근 : sqrt()
		System.out.println("25의 제곱근 : " + (int)Math.sqrt(25));
		System.out.println("81의 제곱근 : " + (int)Math.sqrt(81));
		System.out.println("80의 제곱근 : " + Math.sqrt(80));
		
		
		/*balenciaga triple s
		balenciaga speed runner
		ezeey booster
		louis vuitton skater
		nike airforce 1
		adidas cousion
		adidas jrs */
		
		
	}

}
