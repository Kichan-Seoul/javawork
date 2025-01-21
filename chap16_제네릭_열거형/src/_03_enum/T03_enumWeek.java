package _03_enum;

import java.util.Calendar;

public class T03_enumWeek {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int date = calendar.get(Calendar.DAY_OF_WEEK);
		
		Week week = null;
		switch(date) {
		case 1 :
			week = week.SUNDAY;
			break;
		case 2 :
			week = week.MONDAY;
			break;
		case 3 :
			week = week.TUSEDAY;
			break;
		case 4 :
			week = week.WEDNSDAY;
			break;
		case 5 :
			week = week.THIRSDAY;
			break;
		case 6 :
			week = week.FRIDAY;
			break;
		case 7 :
			week = week.SATERDAY;
			break;
		}
		System.out.println("오늘은 " + week + "입니다");
		
		if (date == 1) {
			System.out.println("오늘은 빡공하는 일요일 입니다");
		} else if (date == 3) {
			System.out.println("응 아직 화욜이야 3일 더남았어. 응 좆댔어~ 그냥 CHILL 해~");
		} else if (date == 7) {
			System.out.println("토요일은? 하체 조지는 날");
		} else if (date == 2) {
			System.out.println("월욜은 가슴");
		}

	}

}
