package kr.s27.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetMain02 {
	public static void main(String[] args) {
		HashSet<Integer> hs =new HashSet<Integer>();
		while(hs.size()<6) {
			Integer ir = (int)(Math.random()*45)+1;
			//중복값을 허용하지 않음
			hs.add(ir); //HashSet은 중복값을 허용하지 않기 때문에 허용하지 않는 ir들만 hs로 넣어줌
		}
		//Hashset -> (Set ->Collection ->) list
		List<Integer> list = new ArrayList<Integer>(hs); //hashset을 오름차순 정렬을 하려면 list를 써야된다 
														//why? Collection함수는 list의 소속(?)되어있어서 Hashset에서는 사용이 불가능하기 때문에 
		//오름차순 정렬
		Collections.sort(list);
		for(int num : list) {
			System.out.print(num+"\t");
		}
	}
}
