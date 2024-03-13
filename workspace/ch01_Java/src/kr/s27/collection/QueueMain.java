package kr.s27.collection;

import java.util.LinkedList;

public class QueueMain {
	public static void main(String[] args) {
		//큐(Queue) : 선입선출 FIFO(First-In First-Out)
		String[] array = {"서울","부산","대구","광주","인천"};
		
		LinkedList<String> linked = new LinkedList<String>();
		
		for(int i=0; i<array.length; i++) {
			//LinkedList에 요소를 저장
			linked.offer(array[i]); //stack에서는 push와 비슷
			
		}
		//저장된 요소의 목록
		System.out.println(linked);
		System.out.println("---------------------------");
		
		//peek은 큐에 저장된 첫번째 요소를 검색 ( != null이기 떄문에 무언가 있을 떄 true반환)
		while(linked.peek() != null) {
			System.out.print(linked.poll()+"\t");//poll은 큐에서 첫번째 요소를 반환하고 제거하는 용도
								  //stack에 pop과 비슷한 용도
		}
		System.out.println("\n------------------------------");
		System.out.println(linked);
	}
}
