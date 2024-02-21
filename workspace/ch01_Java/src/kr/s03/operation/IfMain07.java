package kr.s03.operation;

public class IfMain07 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		/*
		 * [실습]
		 * 생년월일 입력하고 만 나이를 출력하는 프로그램을 작성하시오.
		 * 만 나이 = (현재년도 - 태어난 연도) - (생일이 지났으면 0, 생일이 지나지않았으면 1)
		 * 
		 * [입력 예시]
		 * 출생 연도 입력:2000
		 * 월 입력:3
		 * 일 입력:12
		 * 
		 * [출력 예시]
		 * 만 나이는 23
		 * 
		 */
		//현재 날짜 정보
		int nowYear =2024;
		int nowMonth =2;
		int nowdate = 21;
		
		System.out.print("생년월일 입력:");
		int year = input.nextInt();
		System.out.print("월 입력:");
		int month = input.nextInt();
		System.out.print("일 입력:");
		int date = input.nextInt();
		
		int age = nowYear - year;
		/*
		if ((nowMonth >= month && nowdate >=date) ||
				(nowMonth >= month && nowdate <date)) {
			
			System.out.println("만 나이는 "+ age);
		
		}
		else {
			age--;//age-=1;//age = age - 1;
			System.out.println("만 나이는 " + age);
			
		}
		*/
		
		if(nowMonth < month || (nowMonth == month && nowdate<date)) {
			age--;
		}
		System.out.println("만 나이는 " + age);
		
		input.close();
	}
}
