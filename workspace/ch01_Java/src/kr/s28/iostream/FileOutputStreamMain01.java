package kr.s28.iostream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//파일 생성(덮어쓰기)
			fos = new FileOutputStream("fileout.txt");//상대경로에 만듬.
			//파일 생성(이어쓰기)
			//fos = new FileOutputStream("fileout.txt",true); //기본값이 false이기 때문에 반대인 true를 써주면 이어쓰기가 됨.
			
			String message = "Hello File! 파일에 내용 기술";//fileout.txt에 넣을 내용
			
			//파일에 데이터 기록
						//String -> byte[] =>한글을 입력하기 위해서는 byte를 써야됨.
			fos.write(message.getBytes());//byte[]로 바꾼걸 입력하는 과정
			
			System.out.println("파일을 생성하고 내용을 기술했습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			if(fos !=null)try {fos.close();}catch(IOException e) {}
		}
	}
}

