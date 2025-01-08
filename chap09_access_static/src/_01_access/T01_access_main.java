package _01_access;

public class T01_access_main {

	public static void main(String[] args) {
		T01_access ac = new T01_access();
		ac.num = 10;
		System.out.println(ac.num);
		
		System.out.println(ac.PI);
		//stem.out.println(ac.name));
		//ac.name = "기찬";
		ac.setName("Kichan");
		String name = ac.getName();
		System.out.println(name);
	}

}
