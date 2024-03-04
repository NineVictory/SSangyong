package kr.s20.object.lang;

public class WrapperMain01 {
	public static void main(String[] args) {
		boolean b = true; //기본 자료형 데이터
		Boolean wrap_b = new Boolean(b);//기본 자료형 데이터 -> 참조 자료형 데이터
		//참조 자료형 데이터 -> 기본 자료형 데이터
		boolean b2 = wrap_b.booleanValue();
		System.out.println(b2);
		System.out.println("------------------");//위에는 예전에 했던 방식
		
		
		
		char c = 'A'; //기본 자료형
		Character wrap_c = c;//기본자료형 데이터 -> 참조자료형 데이터 //생성자를 쓰지않고 직접 대입하는 방법(최신방법)
							//auto boxing
		//참조 자료형 데이터 -> 기본 자료형 데이터
		//auto unboxing
		System.out.println(wrap_c);
	}
}
