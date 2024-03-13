package kr.s28.iostream;
import java.io.File;

public class FileMain03 {
	public static void main(String[] args) {
		//상대경로
		String path = "sample.txt";//원래 파일명
		String new_path = "example.txt";//새 파일명
		
		File f1 = new File(path);
		System.out.println("===파일명 변경===");
		File f2 = new File(new_path);
		//파일명을 변경할 수 있으면 변경하고 true 반환, 변경이 불가능하면 false를 반환
		System.out.println(f1.renameTo(f2));//실행 후 한 번 더 실행하면 이미 변경되었기 때문에 false로 나온다. renameTo안에는 객체명만 들어갈 수 있다.
	}
}
