package kr.s29.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressMain01 {
	public static void main(String[] args) {
		BufferedReader br =null;
		InetAddress iaddr = null;
		String name = null;
		try {
			br = new BufferedReader (new InputStreamReader(System.in));
			System.out.print("도메인명 입력:");
			name = br.readLine();
			
			//InetAddress를 이용해서 IP주소 구하기
			iaddr = InetAddress.getByName(name); //ip주소를 구해줌
			
			System.out.println("호스트이름 : "+ iaddr.getHostName());//호스트 이름을 구하는 코드
			System.out.println("호스트 IP주소 : " + iaddr.getHostAddress());// 호스트의 Ip주소를 구하는 코드
			System.out.println("-----------------------");
			
			//로컬 호스트 ip주소 구하기
			iaddr = InetAddress.getLocalHost();
			
			System.out.println("로컬 호스트 이름 : " + iaddr.getHostName());//내 컴퓨터 이름정보
			System.out.println("로컬 호스트 IP주소 : " + iaddr.getHostAddress());//내 컴퓨터 ip주소
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null)try {br.close();}catch(IOException e) {};
		}
	}
}
