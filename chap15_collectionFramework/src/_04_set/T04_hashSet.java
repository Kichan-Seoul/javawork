package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// equals()를 오버라이딩 헸을 때 hashCode()를 반드시 오버라이딩 해야 됨
class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return m.name.equals(name) && m.age == age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
public class T04_hashSet {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("Kichan", 29));
		set.add(new Member("Sohee", 33));
		
		System.out.println("총 객체 수 : " + set.size());
		
		Iterator<Member> iter = set.iterator();
		iterPrint(iter);

		private static void iterPrint(Iterator<Member> iter) {
			while(i.hasNext()) {
				System.out.println(m.name + " " + m.age + ", ");
			}

	
	}

}
/*오늘은 BENCH PRESS 하는날
밑가슴 조지는 법도 배우는 날*/