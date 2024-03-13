package kr.s28.iostream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain02 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("bufferOut.txt");//파일생성
			bos = new BufferedOutputStream(fos);//데이터를넣을 파일을 넘김받음.(문자들을 Buffer안에다가 넣은다음 한 번에 옮기기위해)
			
			String str = "BufferedOutputStream Test 입니다";
					  //String -> byte[]
			bos.write(str.getBytes());//buffer에다가 기록하는코드.
			//버퍼를 비우고 버퍼에 있는 데이터를 파일에 출력
			//플러시하지 않으면 버퍼에 담겨있는 데이터를 파일에 저장하지않음.
			bos.flush();//실행시 str의 내용들이 옮겨진다.
			
			System.out.println("파일을 생성하고 파일에 내용을 기술함.");
			
		}catch(IOException e ) {
			e.printStackTrace();
		}finally {
			//자원정리(flush를 쓰지않고 이걸 쓰면 글이 파일로 옮겨진다.)
			/*(Buffered)는 메모리공간을 활용한다는 뜻이다.
			 * BufferedOutputStream의 close메서드는 지원정리하기전에
			 * buffer를 체크해서 남아있는 데이터가 있으면 flush 처리함.
			 */
			if(bos !=null) try {bos.close();} catch(IOException e){};
			if(fos != null)try {fos.close();}catch(IOException e){}
		}	
	}
}
