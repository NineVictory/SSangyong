package kr.s01.basic;

public class VariableTypeMain02 {
	public static void main(String[] args) {
		//확장 특수 출력 문자(escape sequence)
		char single = '\''; // 따옴표같은 특수문자를 출력할 땐 역슬레쉬를 쓰면된다.
		System.out.println(single);
		
		String str = "오늘은 \"월요일\" 입니다.";
		System.out.println(str);
		
		//문자열에 '를 표시하면 자동으로 일반문자로 변환됨
		String str2 = "오늘은 '서울'에 비가 와요!";//작은따옴표는 큰따옴표 안에 있을 때는 자동으로 문자열로 인식됨
		System.out.println(str2);
		
		String str3 = "C:\\javaWork\\workspace"; //역슬레쉬 출력을 하려면 앞에 똑같이 하나를 더 붙여줘야됨(따옴표 안에서 복붙하면 자동으로 됨)
		System.out.println(str3);
		
		String str4 = "오늘은 월요일\n 내일은 화요일 ";// %n은 printf에서만 사용. 보통 \n으로 줄바꿈을 사용
		System.out.println(str4);
		
		String str5 = "이름\t나이\t취미";
		System.out.println(str5);
		
		String str51 = "이름\r나이\r취미"; // \r 동일한 줄의 맨앞칸으로 커서만 옮긴다.
		System.out.println(str51);
		
		}  
}
	