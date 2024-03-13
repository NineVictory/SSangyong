package kr.s27.collection;

import java.util.Enumeration;
import java.util.Hashtable;
public class HashtableMain {
	public static void main(String[] args) {
		Hashtable<String,Object> h = new Hashtable<String,Object>(); //타입을 여러개 넣어야될 때는 Object를 넣어야된다.
		
		h.put("name", "홍길동");
		h.put("age", 27);
		h.put("tel", "010-1234-5678");
		h.put("job", "경찰");
		h.put("address", "서울");
		//key 중복시 마지막의 입력한 값이 인정 
		h.put("name", "홍길순"); 
		//Hashtable은 key와 value에 null이 불허하다. <->Hashmap과 반대 
		//h.put("hobby", null); //컴파일시 에러가 나지않지만 실행시에는 에러가 난다.
		//h.put(null, "프로그래머"); //컴파일시 에러가 나지않지만 실행시에는 에러가 난다.
		//저장된 데이터(key와 value의 쌍)의 목록
		System.out.println(h);
		System.out.println("--------------------------------------------------");
		//key를 통해서 value 구하기
		String name = (String)h.get("name"); //모든 value값들이 Object로 들어가있어서 다운캐스팅을 해줘야됨.
		Integer age = (Integer)h.get("age");
		System.out.println(name +","+age);		
		System.out.println("--------------------------------------------------");
		
		//Enumeration을 이용해서 key 구하기
		// 해시테이블(Hashtable)에 저장된 키(key)들을 열거형(Enumeration)을 이용하여 순회하고 출력하는 부분
		Enumeration<String> en = h.keys();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key+","+h.get(key));//다운캐스팅을 안하고 Object상태로 출력했다. 자동으로 toString()이 입력된것 
													//why? System.out.println에다가 바로 할떄는 괜찮지만 위에서 보듯이 변수에 넣어서 할 떄는 다운캐스팅이 필요함.
		
		}
	}
}
