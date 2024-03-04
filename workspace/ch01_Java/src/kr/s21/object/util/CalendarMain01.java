package kr.s21.object.util;

import java.util.Calendar;
public class CalendarMain01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		//연도
		int year = today.get(Calendar.YEAR);//(스태틱한 상수)
		//월
		int month = today.get(Calendar.MONTH)+1;//월을 반환할 때 1~12가 아닌 0~11을 반환하기 때문에 마지막에 +1을 해줘야지 올바른 월이 나온다.
												//괄호 안에 +1을 하면 다른 값이 나옴
		//일										
		int date = today.get(Calendar.DATE);
		
		System.out.printf("%d년%d월%d일 ", year,month,date);
		
		int day = today.get(Calendar.DAY_OF_WEEK);//요일 1~7사이 반환
		String[] days = {"알","월","화","수","목","금","토"};// 0~6의 인덱스
		System.out.print(days[day-1]+"요일"); // 인덱스가 0~6인데 DAY_OF_WEEK 함수는 1~7 함수를 반환하기 때문에 -1을 해줘야됨.
		
		int amPm = today.get(Calendar.AM_PM); //오전이면 0, 오후면 1
		
		String str = amPm == Calendar.AM ? "오전":"오후";
		
		int hour = today.get(Calendar.HOUR); //시 HOUR_OF_DAY(24시 표시)
		     
		int min = today.get(Calendar.MINUTE); //분
		int sec = today.get(Calendar.SECOND); //초
		System.out.printf(" %s %d시%d분%d초", str,hour,min,sec);
	}
}
