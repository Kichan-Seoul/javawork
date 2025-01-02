package _03_Repetitive;

public class T05_etc_for {

	public static void main(String[] args) {
		//같은 자료형 일때
		int num1, num2, num3;
		num1 = 10;
		num2 = 10;
		num3 = 10;
		
		int num4 = 10, num5 = 10, num6 = 10;
		num4 = num5 = num6 = 100;
		
		//for문에서 여러개의 변수 사용가능
		for(int i=1, j=30; i<=10; i++, j--) { //조건식은 무조건 변수 1개만 적어야함
			System.out.println("i = " +i + ", j = " + j);
		}

		// for(;;) : while(true)와 동일
		num1 = 7;
		for(;;) {
			System.out.println(num1);
			if(num1 == 15) {
				break;
			}
			num1++;
		}
		
		// for문에 이름을 달아줄 수 있다
		sex : for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
				if(i ==5) {
					break sex;
				}
			}
			System.out.println("");
		}
		System.out.println("구구단 종료");
		
		you : for(int dan=2; dan<=9; dan++) {
			I : for(int i=1; i<=9; i++) {
				for(int z=1; z<=5; z++) {
					System.out.println(dan +", " + i +", " + z);
					if(z==3) {
						break I;
					}
				}
			}
			System.out.println("I for문 종료");
		}
		System.out.println("you for문 종료");
	}

}
