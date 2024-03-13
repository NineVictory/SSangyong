package kr.s28.iostream;

import java.io.IOException;

public class InputStreamMain01 {
	public static void main(String[] args) {
		System.out.print("영문자 1개 입력:");
		try {
			//문자 하나를 입력 받아서 아스키 코드로 반환한다.(아스키 코드이기 때문에 한글을 쓰면 이상한 결과가 나온다.)
							//입력이기 때문에 InputStream을 써서 out이 아닌 in을 사용한다.
			int a = System.in.read();//그냥 쓰면 IOException 에러가 생기기 때문에 try catch 사용
			System.out.println(a+ "," +(char)a);
			
			//enter(엔터를 누르는 것)은 \r와 \n이 합쳐진 것 엔터 때문에 결과값이 제대로 나오지않아서 아래코드를 통해 엔터를 없앤것.
			System.in.read(); //enter 처리 \r 13
			System.in.read(); //enter 처리 \n 10
			
			System.out.print("숫자 1개 입력 : ");
			int b = System.in.read() - 48; // 숫자와 아스키코드와의 차이가 48이기 때문에 -48을 한다.
			System.out.println(b);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
