package _02_wildcardGeneric;

public class Applicant_main {

	public static void main(String[] args) {
		// 모든사람이 신청가능
		/*
		Person p = new Person();
		Applicant<Person> a1 = new Applicant<>(p);
		Course.registerCourse1(a1);
		*/
		
		System.out.println("--- 모든 사람 등록 가능 코스 ---");
		Course.registerCourse1(new Applicant<Person>(new Person())); // 한줄 요약
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("\n--- 학생전용 코스 ---");
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		// Course.registerCourse2(new Applicant<Worker>(new Worker()));	// 불가
		// Course.registerCourse2(new Applicant<Person>(new Person()));	// 불가
		
		System.out.println("\n--- 직장인 & 일반인 전용 코스 ---");
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Person>(new Person()));
		// Course.registerCourse2(new Applicant<Student>(new Student()));	// 불가
		// Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));	// 불가
		// Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));	// 불가
		
	}

}
