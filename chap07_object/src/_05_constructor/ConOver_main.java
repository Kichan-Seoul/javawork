package _05_constructor;

class ConOver {
	int num;
	double dou;
	String name;
	
	ConOver() {
		num = 1;
		dou = 1.0;
		name = "The King Ki-Chan";
	}
	
	ConOver(int num) {
		this.num = num; //this : 나 자신의 객체
		dou = 1.0;
		name = "The King Ki-Chan";
	}
	// 생성자에서 다른 생성자를 호출할 수 있다
	ConOver(int num, double dou) {
		//다른 생성자를 호출할 때는 첫번째에 넣어야 됨
		this(num, dou, "the King of Korea Ki-Chan");
		this.num = num;
		this.dou = dou;
		name = "The King Ki-Chan";
	}
	
	ConOver(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
	}
	
}

public class ConOver_main {

	public static void main(String[] args) {
		ConOver co1 = new ConOver();
		System.out.println(co1.num);
		System.out.println(co1.dou);
		System.out.println(co1.name);
		
		
	}

}