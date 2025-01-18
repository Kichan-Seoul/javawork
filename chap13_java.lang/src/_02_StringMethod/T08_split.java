package _02_StringMethod;

import java.util.Arrays;

// split(기준문자) : 기준문자를 기준으로 문자열을 나누어서 배열로 반환
public class T08_split {

	public static void main(String[] args) {
			String names = "kichan-the king-emperor-of korea";
			String[] name = names.split("-");
			System.out.println(Arrays.toString(name));
			for(String n : name) {
				System.out.println(n);
			}
			
			String names2 = "kichan-yeah/want,sex@seoul";
			String[] name2 = names2.split("-|/|,|@");
			System.out.println(Arrays.toString(name2));
			
	}

}
