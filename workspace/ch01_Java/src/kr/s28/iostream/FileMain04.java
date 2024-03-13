package kr.s28.iostream;

import java.io.File;

public class FileMain04 {
	public static void main(String[] args) {
		//상대경로
		String path = "example.txt"; //기존에 있는 파일명을 명시
		
		File f1 = new File(path);
		
		System.out.println("===파일삭제===");
		
		//delete():삭제할 수 있으면 삭제하고 true를 반환. 삭제가 불가능하면 false를 반환
		if(f1.delete()) {
			System.out.println(f1.getName()+ "파일삭제");
		}else {
			System.out.println("파일을 삭제하지 못했습니다.");//한 번 더 실행하면 이미 삭제되었기 떄문에 else로 빠진다.
		}
	}
}
