package kr.s27.collection;

import java.util.ArrayList;

class A{
	@Override
	//toString을 재정의 해주지않으면 결과값에는 참조값이 나오기 때문에 재정의가 필요하다.
	public String toString() { 
		
		return "A";
	}
}
class B{}

public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//ArrayList에 객체 저장하기 (int,String 등등 여러개를 저장하면 일효율이 떨어진다. 하나만 사용해야좋음)
		list.add(new A());
		list.add(new B());
		list.add("홍길동");
		list.add(10);//자동으로 int -> Integer 가 입력된다. 이를 auto boxing 이라고 한다.
		
		
		//저장된 요소의 목록
		System.out.println(list);
		//요소의 갯수를 반환 .size()
		System.out.println(list.size());
		
	}
}
