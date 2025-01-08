package _03_ex;

public class SmartPhone extends Phone{
	SmartPhone(String model, String color) {
		super(model, color);
	}

	String search(String search) {
		System.out.println(search + "를 검색합니다");
		return "검색완료";
	}
}
