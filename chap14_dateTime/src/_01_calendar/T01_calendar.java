package _01_calendar;

import java.util.Calendar;

// Calendar : 추상클래스. 객체를 생성할 수 없음. 메소드를 이용함
import java.util.Calendar;

public class T01_calendar {

	public static void main(String[] args) {
		// import 하지 않고 쓸 때
		// java.util.Calendar today = java.util.Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		System.out.println("현재 연도 : " + today.get(Calendar.YEAR) + "년");
		System.out.println("현재 월 : " + (today.get(Calendar.MONTH) + 1) + "월"); // 월은 0부터 시작. 그래서 항상 +1을 해줘야함
		System.out.println("이달의 몇번째 주 : " + today.get(Calendar.WEEK_OF_MONTH) + "째주");
		System.out.println("올해 몇번째 주 : " + today.get(Calendar.WEEK_OF_YEAR) + "째주");
		System.out.println("오늘은 " + today.get(Calendar.DATE) + "일");
		System.out.println("오늘은 " + today.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println("오늘은 1년중" + today.get(Calendar.DAY_OF_YEAR) + "일");
		
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일(1:일요일) : " + week);
		
		switch(week) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wendsday");
			break;
		case 5:
			System.out.println("Thirsday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		}	
		
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("am(0). pm(1) : " + today.get(Calendar.AM_PM));
		
		int ampm = today.get(Calendar.AM_PM);
		if(ampm == 0) {
			System.out.print("시간 : AM ");
			if(today.get(Calendar.HOUR) < 10) {
				System.out.print("0");
			}
			System.out.println(today.get(Calendar.HOUR));
		} else {
			System.out.print("시간 : PM ");
			if(today.get(Calendar.HOUR) < 10) {
				System.out.print("0");
			}
		}
		System.out.println(today.get(Calendar.HOUR));
		
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("초 : " + today.get(Calendar.SECOND));
		System.out.println("1/1000초 : " + today.get(Calendar.MILLISECOND));
		
		
	}

}
