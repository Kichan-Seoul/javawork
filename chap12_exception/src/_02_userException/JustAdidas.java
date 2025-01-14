package _02_userException;

class NoNumber extends Exception {
	NoNumber(String message) {
		super(message);
	} 
}

class Calculator {
	int add(int num1, int num2) throws NoNumber {
		if (num1 <0 || num2 <0) {
			throw new NoNumber("음수는 입력할 수 없습니다" + num1 + ", " + num2);
		}
		return num1 + num2;
	}
}

public class JustAdidas {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		
		int number1 = -7;
		int number2 = 3;
		
		try {
			int result = calculator.add(number1, number2);
			System.out.println("결과 : " + result);
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}

	}

}
