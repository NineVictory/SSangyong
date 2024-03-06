package kr.s26.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionMain06 {
	/*
	 * throws 예약어의 사용
	 * 메서드에 throws 예외클래스를 명시하면 메서드내에 try~catch블럭을 생략하고 
	 * 예외가 발생하면 예외를 임시 보관하고 메서드를 호출하는 곳에
	 * try~catch블럭이 있을 경우 그곳으로 예외를 양도함.
	 */
						//()와 {} 사이에 throws를 입력해야됨. IOException는 필수로 입력해야하지만 NumberFormatException은 런타임시에만 진행되기 떄문에 필수 입력은 아니다. 
	public void printData()throws IOException, NumberFormatException {//예외를 이곳에서 임시 보관해준다.
							//throws IOException, NumberFormatException를 쓰지 않으면 아래에 br.readLine()의 빨간밑줄이 생긴다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단 입력:");

		//String -> int //BufferedReader는 String으로 받기 때문에 int로 바꿔야된다(?)
		int dan = Integer.parseInt(br.readLine());//한 라인에 입력한 데이터를 반환 //br.readLine();는 try catch로 감싸주지않으면 에러가남
		System.out.println(dan + "단");
		System.out.println("---------------------------");
		for (int i =1; i<=9 ;i++) {
			System.out.println(dan+"*"+ i + "=" + dan*i);
		}

	}

	public static void main(String[] args) {
		ExceptionMain06 em = new ExceptionMain06();
		try {
			em.printData();
		}catch(IOException e) {
			System.out.println("입력시 오류 실행");
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}
	}
}

