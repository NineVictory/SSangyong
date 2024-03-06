package kr.s24.object.enumtest;

public class EnumMain01 {
	//문자열 상수
	public static final String JAVA = "JAVA";
	public static final String XML ="XML";
	public static final String JSP = "JSP";
	
	
	public static void main(String[] args) {
		//문자열 상수 호출 (static 이기 때문에 객체생성 없이 호출) -> (원래는 EnumMain01.JAVA 이런식으로 호출함.)
		System.err.println(JAVA);
		System.out.println(XML);
		System.out.println(JSP);
	}
}
