package _02_wildcardGeneric;

public class Course {
	// 모든 사람이 등록 가능
	static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 course1을 등록");
	}
	
	// 학생만 등록 가능
	static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 course2을 등록");
	}
	
	// 직장인 및 일반인 등록 가능
	static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 course3을 등록");
	}
}

// COurse.registerCourse1(new Appicant<Person>())