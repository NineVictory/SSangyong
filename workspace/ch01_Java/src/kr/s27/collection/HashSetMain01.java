package kr.s27.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain01 {
	public static void main(String[] args) {
		//HashSet:중복값 불허
		String[] array = {"Java","JSP","Java","Oracle"};
		
		HashSet<String> hs = new HashSet<String>();
		for(String n : array) {
			hs.add(n);//중복 불허
		}
		//저장된 요소의 목록
		System.out.println(hs);
		System.out.println("-----------------------");
		//저장된 요소의 출력
		Iterator<String> ir = hs.iterator(); //가지고 있던 hashset 데이터를 복사해서 iterator 객체로 새로 만드는 과정
		while(ir.hasNext()) { //안에 데이터가 있으면 true를 반환하는 함수
			System.out.println(ir.next()); //나온 결과는 이터레이터 형식임   
		}
		System.out.println("-----------------------");
		//확장for문 사용 확장for문이 생긴뒤로 위에 iterator를 사용하지 않아도 가능하다.
		for(String s : hs) {
			System.out.println(s);
		}
	}
}
