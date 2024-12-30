package _01_operation;

public class T01_assignment {

	public static void main(String[] args) {
		// % : 나누기 후 나머지 값
		int result = 10%3;
		System.out.println("10을 3으로 나눈 나머지 : "+result);
		
		result = result+1;
		System.out.println("result + 1 ="+result);
		
		result += 1; // result = result+1;과 같은 문장임
		System.out.println("result + 1 ="+result);
		
		result *= 3; // result = result*3
		System.out.println("result * 3 ="+result);
		
		result -= 3; // result = result-3
		System.out.println("result - 3 ="+result);
		
		result /= 2; // result = result/2
		System.out.println("result / 2 ="+result);
		
		result = 7; 
		System.out.println(result);
		
		result %= 5; // result = result%5
		System.out.println("result % 5 ="+result);
		
		
		int num2 = 300_000_000; //언더바로 사람이 보기 편하게 사용
		System.out.println(num2);
	}
}
