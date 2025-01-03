package _01_string;

import java.util.Scanner;

public class T01_string {

	public static void main(String[] args) {
		String name1 = "김기찬";
		String name2 = "김기찬";
		System.out.println(name1==name2);
		
		String name3 = name1;
		System.out.println(name1==name3);
		
		String str1 = new String("김기찬");
		String str2 = new String("김기찬");
		System.out.println("주소가 같은가? " + (str1==str2));
		System.out.println("그 안의 값이 같은가? " + str1.equals(str2));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소 입력(시, 도까지만) : ");
		String city = sc.next();
		
		// if(city=="경기도") -> city의 주소와 "경기도"가 같은가?
		if(city.equals("경기도")) {
			System.out.println("경기도사람");
		}
		System.out.println("End");
	}

}
