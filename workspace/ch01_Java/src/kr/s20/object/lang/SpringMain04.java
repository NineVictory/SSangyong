package kr.s20.object.lang;
import java.util.Scanner;
public class SpringMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 입력 받은 문자열을 한 문자씩 읽어서 역순으로  표시
		 * 
		 * [입력 예시]
		 * 문자열: hello
		 * 
		 * [출력 예시]
		 * olleh
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("문자열 : ");

		String str = input.nextLine();

		
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		/*
		String num = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			char c = str.charAt(i); 
			num += c;       
			
		}
		System.out.println(num);
		*/
		
		
		
		input.close();
	}
}
