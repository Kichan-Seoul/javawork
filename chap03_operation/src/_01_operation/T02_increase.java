package _01_operation;

public class T02_increase {

	public static void main(String[] args) {
		// ++ : 하나 증가
		// -- : 하나 감소
		
		int num = 10;
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);
		// 단일 항 일때는 연산자가 앞이나 뒤나 상관없이 결과는 똑같다.
		
		// 항이 2개일 때 연산을 하면 앞이나 뒤에 붙는것에 따라 결과가 달라진다.
		num = 10;
		int num2 = 10;
		
		int result = ++num + ++num2;
		// 증감연산자가 앞에 붙으면 증가를 먼저 시킨다.
		System.out.println(result);
		
		num = 10;
		num2 = 10;
		result = num++ + num2++;
		// 증감연산자가 뒤에 붙으면 연산 먼저 하고 그 다음 나를 증가시킴
		System.out.println(result);
		System.out.println("num = "+num+", Num2 = "+num2);
		
		num =10;
		num2 = 10;
		result = ++num + num2++;
		System.out.println(result);
		
		num = 10;
		num2 = 10;
		result = --num + num2--;
		result = num-- + ++num2;
		
				
		

	}

}
