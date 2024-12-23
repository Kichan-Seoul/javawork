package chap01_print;

public class Escape_05 {

	public static void main(String[] args) {
		// 이스케이프 문자(escape sequence)
		/*
		 * 문자조합으로 특수기능을 수행(\역슬래시와 함께 사용) ->원
		 * \n : 줄바꿈
		 * \t : 탭만큼 띄우기
		 * \" : 쌍따음표 표시
		 * \\ : 역슬래시(\) 표시
		 */
		System.out.print("김기찬 공부\n싫어\n");
		System.out.print("공부누가\t만듦?\n");
		System.out.print("인포에서 밴딩 \"김기찬 게스트\"라고 말하거라\n");
		System.out.print("알겠느냐 \\게패 5000원아");

	}

}
