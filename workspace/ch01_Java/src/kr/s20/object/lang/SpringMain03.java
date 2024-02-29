package kr.s20.object.lang;

public class SpringMain03 {
	public static void main(String[] args) {
		String s1 = "   aBa   ";
		String s2 = "abc";
		int a = 100;
		String msg = null;
		
		msg = s1.toUpperCase(); //소문자를 대문자로 바꿔주는 함수
		System.out.println("msg:"+ msg);
		
		msg = s1.toLowerCase(); //대문자를 소문자로 바꿔주는 함수
		System.out.println("msg:"+ msg);
		
		msg = s1.replace("aB", "b"); //old 문자를 new 문자로 대체 (aB를 b로 바꾸는 함수)
		System.out.println("msg:"+ msg);
		
		msg = s1.trim(); //앞뒤에 공백 제거
		System.out.println("msg :"+msg);
		
		//문자열(   aBa   ) 중에 메서드의 인자로 전달된 문자열이 포합되어있는지 검증(aB가 aBa에 인자로 포함되어있기 때문에 true)
		boolean f = s1.contains("aB");
		System.out.println("f = " +f);
		
		//메서드의 인자로 전달된 문자열로 시작하는지 검증
		f = s2.startsWith("ab"); //abc 문자열에서 ab로 시작하는지. ab로 시작하니 true 
		System.out.println("f = " +f);
		
		//메서드의 인자로 전달된 문자열로 끝나는지 검증
		f = s2.endsWith("bc");//abc 문자열에서 bc로 끝나는지. bc로 끝나니 true
		System.out.println("f = " +f);
		
		//int -> String
		msg = String.valueOf(a);//메서드를 이용해서 바꾸는 방법
		msg = a + ""; //메서드를 이용안하고 문자열로 바꾸는 방법 <""> 빈문자열과 합치면됨
		
	}
}
