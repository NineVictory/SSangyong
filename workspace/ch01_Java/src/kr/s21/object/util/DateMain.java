package kr.s21.object.util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toString());
		System.out.println("-----------------");
		
		//deprecated 되어 사용하지 않음.
		System.out.println(now.toLocaleString());
		System.out.println("-----------------");
		
		DateFormat df = DateFormat.getInstance();
		String today =df.format(now);
		System.out.println(today);
		System.out.println("-----------------");
		
		df = DateFormat.getDateTimeInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("-----------------");
		
		df=DateFormat.getDateInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("----------------------");
		
		df= DateFormat.getTimeInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("----------------------");
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일(E) a hh:mm:ss");//대문자 MM은 월 , 소문자 mm은 분 등 대소문자 구분을 확실히 해야됨.   
		today = sf.format(now);
		System.out.println(today);
	}
}    
