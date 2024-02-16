package kr.s01.basic;
//주석: 코드에 대한 설명을 달거나 코드를 컴파일할 때 제외시켜서 실행되지않도록 할 때 사용

public class PrintMain01 {//클래스시작
	public static void main(String[] args) {
		//출력 후 줄바꿈
		System.out.println("봄");//println 에서 ln은 라인의 약자로 줄을 바꿔라 라는 뜻
		// -> 한줄주석
		//System.out.println("여름");//세미콜론은 한줄의 마무리를 나타내기 때문에 필수 
		//출력 후 줄바꿈 없음
		System.out.print("가을");
		System.out.print("겨울"); //ln을 쓰지않으면 줄바꿈이 안됨
		/**
		 * @author BIG BANG
		 */
		
		// /*는 여러줄 주석    
		/*
		System.out.println("서울");
		System.out.println("부산");
		*/
		System.out.println("강릉");
		
	}
}//클래스 끝
