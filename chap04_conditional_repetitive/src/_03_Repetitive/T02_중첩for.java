package _03_Repetitive;

public class T02_중첩for {

	public static void main(String[] args) {
		/*중첩 for문
		for(초기식; 조건식; 증감식) {
			for(초기식; 조건식; 증감식) {
				실행구문;
			}
		}*/

		for(int i1=1; i1<=3; i1++) {
			for(int i2=5; i2<=7; i2++) {
				System.out.println("i1 = " + i1 + ", i2 = " + i2);
			}
			System.out.println("");
		}
		
		// 구구단
		
		for(int i1=2; i1<=9; i1++) {
			System.out.println(" " + i1 + "단");
			for(int i2=1; i2<=9; i2++) {
				//System.out.println(i1 + "*" + i2 + "=" + (i1 * i2));
				System.out.printf("%d*%d=%2d\n", i1, i2, i1*i2); //오른쪽 정렬
			}
			System.out.println();
		}
		
	}

}
