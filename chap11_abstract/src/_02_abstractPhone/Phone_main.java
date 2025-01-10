package _02_abstractPhone;

public class Phone_main {

	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone("iphone", "gold");
		FolderPhone p2 = new FolderPhone();
		
		System.out.println(p1.model);
		p1.bell();
		p1.hangUp();
		p1.response();
		p1.response();
		p1.hangUp();
		p1.search("아니 시바라");
		
		p2.response();
		

	}

}
