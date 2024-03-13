package kr.s27.collection;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		//스택(Stack) :후입선출 LIFO(Last-In First-Out) 방식
		String[] array = {"진달래","백합","개나리","벚꽃","장미"};
		
		Stack<String> stk = new Stack<String>(); //Stack은 util 패키지에 있어서 호출이 필요
		//반복문을 이용해서 Stack에 요소 저장
		for(int i = 0; i <array.length; i++) {
			stk.push(array[i]); //객체를 저장 .push()를 사용해서
		}
		//저장된 요소의 목록
		System.out.println(stk);
		System.out.println("----------------------------");
		
		//현재스택이 비어있는지 검증
		while(!stk.isEmpty()) {//!를 넣었기 때문에 비어있지않으면 true인것 원래는 비어있으면 true임
			System.out.print(stk.pop()+"\t");//pop은 스택에 저장된 객체를 꺼낸다. 즉 여기선 꺼내서 출력하는것
		}
		System.out.println("\n----------------------------");
		System.out.println(stk);//pop을통해 stk안에 있던 것들이 다 빠지고 빈 리스트만 남았음.
	}
}
