package kr.s03.operation;

public class ForMain05 {
	public static void main(String[] args) {
		//2단부터 9단을 만들기위한 다중for문 사용
		for(int dan=2;dan<=9;dan++) {//dan :구구단의 단 2~9
			System.out.println("**"+dan+"단**");
			
			for (int i=1; i<=9;i++) {//곱해지는 수 1~9
				System.out.println(dan+"*"+i+"="+dan*i);
			}
		}
		
		
		
		
		java.util.Scanner input =
				new java.util.Scanner (System.in);
		
		
		input.close();
	}
}
