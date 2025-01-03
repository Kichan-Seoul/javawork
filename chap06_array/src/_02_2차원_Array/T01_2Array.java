package _02_2차원_Array;

public class T01_2Array {

	public static void main(String[] args) {
		// 2차원 배열 : [행의 index번호][열의 index번호]
		// 배열을 선언하면서 값을 넣을 때
		int[][] score = {
				{1,2,3,5},//[0]행의 index번호
				{6,7,80},//[1]
				{7,6,5,4,3}// [2]
		}; //열의 index번호 [0][1][2][3][4]
		
		System.out.println("score의 행의 길이 : " + score.length);
		System.out.println("score[0]의 열의 길이 : " + score[0].length);
		System.out.println("score[1]의 열의 길이 : " + score[1].length);
		System.out.println("score[2]의 열의 길이 : " + score[2].length);
		
		// 배열을 선언만 할 때
		int[][] score2 = new int[4][3];
		
		for(int row=0; row<score.length; row++) {
			for(int column=0; column<score[row].length; column++) {
				System.out.print(score[row][column] + " ");
			}
			System.out.println();
		}
		
	}

}
