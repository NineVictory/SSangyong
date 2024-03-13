package kr.s28.iostream;
import java.io.File;
import java.io.IOException;

public class FileMain02 {
	public static void main(String[] args) {
		//절대경로
		//String path ="C:\\javaWork\\sample.txt";//sample.txt를 만들고 싶을 때 역슬레쉬를하고 절대경로 뒤에 추가한다.
	
		//상대경로
		String path = "sample.txt"; //파일명만 명시
		
		File f1 = new File(path);
		System.out.println("====파일 생성====");
		try {
			/*
			 * 제공된 경로를 기반으로 파일을 생성. 파일이 생성되면 true를 반환, 생성되지 않으면 false를 반환
			 * 경로가 잘못되면 IOException 발생
			 * (절대경로 일 경우)true가 나오면 javawork에 들어가보면 sample.txt 파일이 생겨있음.
			 * (상대경로 일 정우)C:\javaWork\workspace\ch01_Java\sample.txt 위치에 파일이 생김(탐색기에만 보이고 이클립스에는 새로고침을 해야 보임<ch01.java->Refresh>)
			 * 한 번 더 실행하면 이미 있는 파일이기 때문에 덮어씌우는 것이 아닌 그냥 false가 발생.
			 */
			System.out.println(f1.createNewFile());//createNewFile 새로운 파일을 만드는 함수. 그치만 그냥쓰면 IOException에러나 생길 수 있어서 try catch가 필요
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("===파일 정보 ===");
		System.out.println("절대경로 : "+ f1.getAbsolutePath());
		System.out.println("상대경로 : "+ f1.getPath());
		System.out.println("디렉토리명 : "+f1.getParent());//상대경로만 지정할 시null값이 나오는 이유는 경로지정시 파일명만 지정을하고 디렉토리명을 지정을하지 않아서.
		System.out.println("파일명 : "+f1.getName());
	}
}
