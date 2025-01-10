package _02_abstractPhone;

public class SmartPhone extends Phone{
	SmartPhone(String model, String color) {
		super(model, color);
	}

	String search(String search) {
		System.out.println(search + "를 검색합니다");
		return "검색완료";
	}
	/*@override
	void hangUP() {
		
	}
	
	@Override
	void hangOut() {
		
	}*/

	@Override
	void hangUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void response() {
		// TODO Auto-generated method stub
		
	}
}
