package _01_oneArray;

import java.util.Arrays;
import java.util.Scanner;

public class T02_etclArray {

	public static void main(String[] args) {
		char chArr[] = {'a','b','c','d'};
		double dArr[] = {3.14, 5.87, 297.834};
		boolean bArr[] = {true, false, false, true};
		String sArr[] = {"김기찬", "마은하", "LOVE"};
		
		String sArr2[] = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<sArr2.length; i++) {
			System.out.print((i + 1) + "번째 팀원 이름 입력 : ");
			sArr2[i] = sc.next();
		}
		
		for(int i=0; i<sArr2.length; i++) {
			System.out.print(sArr2[i] + ", ");
		}
		System.out.println("");
		
		/*
		System.out.print(1 + "번째 팀원 이름 입력 : ");
		sArr2[0] = sc.next();
		System.out.print("두번째 팀원 이름 입력 : ");
		sArr2[1] = sc.next();
		System.out.print("세번째 팀원 이름 입력 : ");
		sArr2[2] = sc.next();*/
		
		
		System.out.println(Arrays.toString(sArr2));
		System.out.println(chArr); //char 자료형만 배열을 그냥 출력해도 문자 나옴
		System.out.println(Arrays.toString(dArr)); //char자료형을 제외한 모든 자료형은 배열을 그냥 출력하면 첫번째 주소가 나옴
		//별도 Arrays라는 클래스에 미리 프로그램 해 놓음
		// toString(배열) : 그 안의 값들을 모두 돌면서 출력
	}

}
