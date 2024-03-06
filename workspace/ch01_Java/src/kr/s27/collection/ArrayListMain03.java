package kr.s27.collection;

import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		/*
		 * 제네릭 표현 : 객체를 생성할 때 객처에 저장할 수 있는 요소의 타입을 지정
		 */
		ArrayList<String> list = new ArrayList<String>(); //<String>만 쓰겠다 라는 제네릭 표현 
		list.add("장영실");//String -> Object -> 제네릭을 쓰면 Object 로 저장 X 기존 String 으로 유지
		list.add("홍길동");//String -> Object-> 제네릭을 쓰면 Object 로 저장 X 기존 String 으로 유지
		//list.add(1000);//Integer -> Object 문법적인 문제는 없음 // 제네릭 표현을 쓰니까 문법적으로 문제가 생긴다.
						//String 으로 한정했기 때문에 Integer 데이터는 저장불가
		list.add("김유신"); //String -> Object-> 제네릭을 쓰면 Object 로 저장 X 기존 String 으로 유지
		
		//반복문을 이용한 요소의 출력
		for(int i = 0; i<list.size(); i++) {
			String name = (String)list.get(i); //1000이 String 이 되어도 컴파일 에러는 없음. 대신 실행시 타입에러 발생
												//(에러내용: Integer 가 String 으로 형변환이 불가능하다) 이러한 문제를 사전에 "제네릭 표현"을 써서 방지한다.
			System.out.println(name);
		}
		System.out.println("-------------------");
		
		//확장for문을 이용한 요소의 출력
		for(String name : list) {
			System.out.println(name);
		}
	}
}
