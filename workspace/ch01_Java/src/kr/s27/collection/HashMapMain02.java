package kr.s27.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {"Berlin","Paris","Seoul","New York","London"};

		HashMap<Integer, String> map = new HashMap<Integer,String>();
		//HashMap에 key와 value 저장
		for(int i =0; i<msg.length; i++) {
			map.put(i, msg[i]); //key를 인덱스 값으로 넣는다.
		}
		//HashMap의 데이터 목록 호출
		System.out.println(map);
		System.out.println("---------------------------");
		
		//HahMap에는 key를 구해서 뽑아내는 메서드가 없기 떄문에 set 객체로 복사하여 변환을 해준뒤 iterator 객체를 만들어서 뽑아낸다.
		//즉 HashMap ->Set -> iterator
		//key를 구하는 방법
		
		//Set<Integer> s = map.keySet();
		//Iterator<Integer> keys = s.iterator();
		Iterator<Integer> keys = map.keySet().iterator();//위에 두줄은 한줄로 명시하는 법
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(key+","+map.get(key));
		}
	}
}
