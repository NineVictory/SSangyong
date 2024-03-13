package kr.s29.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLMain01 {
	public static void main(String[] args) {
		try {
			// 포트를 뺸다거나 여러가지를 빼도 실행하는데 에러는 나지않지만 프로토콜http를 빼면 에러가난다.
			URL url = new URL("http://java.sun.com:8080/index.jsp?name = kim #content");
			System.out.println("프로토콜 : "+ url.getProtocol());//프로토콜:http를 출력하는 코드
			System.out.println("호스트 : "+ url.getHost());//호스트 : java.sun.com를 출력하는 코드
			System.out.println("기본 포트 : "+ url.getDefaultPort());//프로토콜 http의 기본포트를 출력하는 코드
			System.out.println("포트 : "+url.getPort());//명시한 포트가 없을 시 -1이 반환된다.(com뒤에 :8080 과 같은 것을 명시하면 잘 나옴)
			System.out.println("패스 : "+ url.getPath());
			System.out.println("쿼리 :" + url.getQuery());
			System.out.println("ref : "+ url.getRef());// # 뒤에 오는 레퍼런스 
		}catch(MalformedURLException e) {//url을 제대로 입력하지 않을시 나오는 에러
			e.printStackTrace();
		}
		
	}
}
