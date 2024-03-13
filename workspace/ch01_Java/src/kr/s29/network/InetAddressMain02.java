package kr.s29.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain02 {
	public static void main(String[] args) {
		BufferedReader br = null; //얘는 꼭 null로 초기화 해줘야함.
		InetAddress[] addresses;
		String name;// = null안써도됨.
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("도메인명 입력 : ");
			name = br.readLine();
			//해당 도메인과 매핑되어 있는 모든 주소를 읽어옴
			addresses = InetAddress.getAllByName(name); //모든 IP주소를 읽어오는 코드
			for(int i =0; i<addresses.length; i++) {
				System.out.println("호스트 이름 : " + addresses[i].getHostName()+","+"Ip주소 : " + addresses[i].getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();

		}finally {
			if(br !=null)try {br.close();} catch(IOException e) {};
		}

	}
}

