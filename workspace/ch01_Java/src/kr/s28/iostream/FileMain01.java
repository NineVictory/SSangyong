package kr.s28.iostream;
import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		String path = "C:\\"; //역슬레쉬는 디렉토리 구분자 , 원랜 하나지만 자바에서는 특수문자로 사용하기 때문에 역슬레쉬는 2번 사용

		File f = new File(path);

		// 존재하지않거나       디렉토리가 아니면 프로그램 종료 
		if(!f.exists()|| !f.isDirectory()){
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);//프로그램 종료    
		}
		//지정한 디렉토리의 하위 디렉토리와  파일 정보를 반환
		File[] files = f.listFiles();
		for(int i =0 ; i <files.length ; i ++) {
			File f2 = files[i];//f2가 하위 디렉토리와 파일정보를 받음
			if(f2.isDirectory()) {//디렉토리인지 확인하는 함수
				System.out.println("["+f2.getName()+"]");//getName을 써서 디렉토리명을 
			}else {//반대로 파일인경우
				System.out.print(f2.getName());//getName을 써서 파일명을
				//파일은 디렉토리와 다르게 용량의 개념이 있음
				System.out.printf("(%,dbytes)%n",f2.length());//length로 길이 즉 용량을 구함.
			}
		}
	}
}
