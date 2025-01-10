package _02_abstractPhone;

public class FolderPhone extends Phone {

	FolderPhone() {
		super("실버", "검정");
		// TODO Auto-generated constructor stub
	}

	@Override
	void hangUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void response() {
		// TODO Auto-generated method stub
		System.out.println("아직도 이딴걸 쓰냐");
	}
	
}
