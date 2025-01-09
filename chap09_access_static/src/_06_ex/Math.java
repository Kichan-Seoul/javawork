package _06_ex;

public class Math {
	private String name;
	private int age;
	private int height;
	private int weight;
	private String area;
	
	Math() {
		
	}
	Math(String name, int age, int height, int weight, String area) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.area = area;
	}
	
	public String getDetails() {
		return String.format("이름 : %s\n나이 : %s세\n키 : "
				+ "%scm\n몸무게 : %skg \n서식지 : %s", name, age, 
				height, weight, area);
	}
	
}	