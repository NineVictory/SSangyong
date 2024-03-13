package kr.s28.iostream;
import java.io.File;

public class FileMain05 {
	public static void main(String[] args) {
		String path = "C:\\javaWork//javaSample";
		
		File f1 = new File(path);
		
		System.out.println("===디렉토리 생성 ===");
		//디렉토리를 생성할 수 있으면 true , 생성할 수 없으면 false 반환
		System.out.println(f1.mkdir());// 한 번 더 실행하면 false
		
	}
}
  