package _01_oneArray;

public class T03_ex01 {

	public static void main(String[] args) {
		// 1. 총점과 평균 구하기
		int score[] = {100, 98, 49, 78, 86};
		int total = 0;
		int avg = 0;
		for(int i=0; i<score.length; i++) {
			total += score[i];
			avg = total / score.length;
		}
		System.out.println("총점 : " + total + "평균 : " + avg);
		System.out.println("");
		
		// 2. 최대값과 최소값 구하기
		int num[] = {83, 70, 27, 49, 20, 86, 90, 83, 58, 29};
		// 최소값 : 20
		// 최대값 : 90
		int min = num[0];
		int max = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			} else if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}

}
