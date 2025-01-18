package _03_ex;

public class Member {
	//속성
	private String name;
	private int age;
	private String gender;
	//생성자
	public Member()	 {
		
	}
	public Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	//getter setter 메소드
	public void setname(String name) {
		this.name = name;
	}
	public String getname(String name) {
		return name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public int getage() {
		return age;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	//오버라이딩
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender;
	}
}
