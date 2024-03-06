package kr.s27.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		
		//인덱스 탐색
		int index1 = list.indexOf("사과"); //사과라는 문자의 인덱스 위치를 탐색하는 함수. 중복값일경우 첫번째
		System.out.println("첫번째 사과 : "+ index1);
		
		int index2 = list.lastIndexOf("사과"); //사과라는 문자의 인덱스 위치를 뒤에서부터 탐색하는 함수
		System.out.println("마지막 사과 : "+index2);
		
		int index3 = list.indexOf("망고");//리스트에 없는 값은 -1로 반환한다.
		System.out.println("망고 : " + index3);
		
		//검색기능: ArrayList에 머루가 저장되어 있으면 true를 반환 없으면 false를 반환
		boolean f1 = list.contains("머루"); 
		System.out.println("머루 : "+ f1);
		
		boolean f2 = list.contains("망고");
		System.out.println("망고 : " + f2);
		
		//요소의 목록 출력
		System.out.println(list);
		System.out.println("-----------------------");
		
		//정렬(사전에 명시된 순서대로)
		Collections.sort(list);
		System.out.println(list);  
		
		//역순으로 정렬
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("-----------------------");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(100);
		list2.add(15);
		list2.add(2);
		list2.add(40);
		
		System.out.println(list2);
		
		//정렬(오름차순 정렬)
		Collections.sort(list2);
		System.out.println(list2);
		
		
	}
}
