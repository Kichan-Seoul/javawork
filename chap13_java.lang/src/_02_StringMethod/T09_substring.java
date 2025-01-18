package _02_StringMethod;
// substring(index) : index번호 부터 ~ 끝까지 가져오기
// substring(fromIndex, endIndex) : fromIndex번호 부터 ~ endIndex번호 까지 가져오기
public class T09_substring {

	public static void main(String[] args) {
		String str = "spring aws start";
		
		String result = str.substring(7);
		System.out.println(result);

		String result2 = str.substring(7,10);
		System.out.println(result2);
		
		String sn = "030523-3245678";
		String gender = sn.substring(7,8);
		System.out.println(gender);
		
		int gender2 = Integer.parseInt(sn.substring(7,8));
		System.out.println(gender2);
		
		if(gender2 == 1 || gender2 == 3) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		if(gender.equals("1") || gender.equals("3")) {
			System.out.println("man");
		} else {
			System.out.println("woman");
		}
		
		switch(gender2) {
		case 1: case 3:
			System.out.println("man");
		 break;
		default:
			System.out.println("woman");
		}
		
		String month = sn.substring(2,4);
		String day = sn.substring(4,6);
		System.out.println(month + "월 " + day + "일생 입니다");
		
		int age = Integer.parseInt(sn.substring(0,2));
		System.out.println("나이는 " + (25 - age) + "세 입니다");
		
		if(age <= 25) {
			int ageSub = age + 2000;
			System.out.println(ageSub + "년생");
		} else {
			int ageSub2 = age + 1900;
			System.out.println(ageSub2 + "년생");
		}
	}

}
