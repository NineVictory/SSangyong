package kr.s28.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte;
		byte[] readbyte2; //바이트 배열 생성
		try {
			fis = new FileInputStream("file.txt");
			//파일의 정보를 한 문자씩 읽어 들여 아스키 코드로 반환
			//영문 이외의 문자(2byte<한글>)는 깨진다. 1byte만 안깨짐
			/*
			while((readbyte = fis.read())!= -1) {
				System.out.print((char)readbyte);
			}
			 */
			//영문 이외의 문자도 처리 가능
			readbyte2 = new byte[fis.available()];//available() -> 입력받은 문자를 몇 바이트인지 자동으로 환산해주는 것
			//파일로부터 읽어 들인 데이터를 byte[]에 저장
			fis.read(readbyte2);
								//byte[] -> String
			System.out.println(new String(readbyte2));

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리:작업을 못하게 만드는 것. 객체 소멸은 시키지 못함.
			if(fis!=null)try {fis.close();}catch(IOException e) {}
		}
	}
}
