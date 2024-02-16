package kr.s01.basic;
/*
 * 문자(한문자)는 '' 작은따옴표를 쓴다 'A' '가' 
 * 문자열(한문자 이상)은 "" 큰따옴표를 쓴다 "apple" "가위"
 * 어길시 에러발생
 * '서울' -> 불가능
 * "가" -> 가능
 * ====================
 * 논리값(boolean)
 * ->참(true)
 * ->거짓(false)
 */
public class PrintMain03 {
	public static void main(String[] args) {
		//문자: 한 문자
		System.out.println('A'); //' ' 는 문자를 의미하는 특수문자!, A를 일반문자라고 부른다.
		System.out.println('강');
		//문자열에 ''를 사용할 수 없음
		//System.out.println('도시');
		//문자열: 한 문자 이상의 문자들
		System.out.println("Z");
		System.out.println("city");
		System.out.println("한강");
		
		//숫자(정수)
		System.out.println(23);
		System.out.println("23");//문자열
		
		//숫자(실수)
		System.out.println(3.14);
		System.out.println("3.14");//문자열
		
		//논리값(boolean)
		System.out.println(true); //참값
		System.out.println(false);//거짓값
		System.out.println("true"); //문자열
	}
}
