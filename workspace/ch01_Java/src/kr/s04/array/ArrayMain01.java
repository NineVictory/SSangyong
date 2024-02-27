package kr.s04.array;

public class ArrayMain01 {
	public static void main(String[] args) {
		//배열선언
		char[] ch; //char[]은 배열의 자료형
		//배열 생성	
		ch = new char[4];//4는 배열의 길이를 말함.(0123)순서
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';            
		
		
		//배열의 요소 출력
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println("===================");
		//반복문을 이용한 배열의 요소 출력
		for(int i=0;i<ch.length;i++) { //i<4 는 배열의 길이 (배열의 길이를 알고 있을 때)
									  //i<ch.length는 배열의 길이(배열의 길이를 모를 떄)
			System.out.println("ch["+i+"]:"+ch[i]);
		}
		
		//배열의 선언 및 생성
		int[] it = new int[6]; //위에서는 따로따로 여기선 한줄로 만듬
		
		//배열의 선언 및 생성(명시적 배열 생성), 초기화
		char[] ch2 = new char[] {'J','A','V','A'};
		
		//배열의 선언 및 생성(암시적 배열 생성), 초기화
		char[] ch3 = {'자','바'}; //new char[]를 생략
		
	}
}
