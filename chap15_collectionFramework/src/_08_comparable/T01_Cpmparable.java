package _08_comparable;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if(age<o.age) {
			return -1;
		} else if (age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}
}

public class T01_Cpmparable {

	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<>();
		treeset.add(new Person("병신", 25));
		treeset.add(new Person("장애", 35));
		treeset.add(new Person("고아", 27));
		
		Iterator<Person> iterator = treeset.iterator();
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.name + " : " + p.age);
		}

	}

}
