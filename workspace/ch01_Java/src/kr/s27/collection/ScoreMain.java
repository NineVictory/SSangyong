package kr.s27.collection;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {
	ArrayList<Score> list; //여기다가 멤버변수 선언하면서 같이 해도되고 아래처럼 생성자 안에 따로 해도 상관없음.
	BufferedReader br;
	/*
	 * [실습]
	 * 메뉴: 1.성적입력,2.성적출력,3.종료
	 * 메서드명 : 메뉴 callMenu(),
	 * 			성적입력:inputScore(),
	 * 			성적출력:printScore()
	 * 입력시 조건 체크 : 0부터 100까지만 입력 가능
	 */
	public ScoreMain() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in) );
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br != null) {try {br.close();}catch(IOException e) {}
			}
		}


	}
	//메뉴입력
	public void callMenu() throws IOException{
		
		while(true) {
			System.out.print("메뉴: 1.성적입력,2.성적출력,3.종료 : " );
			
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {//성적입력
					inputScore();
				}else if(num ==2) {//성적출력
					printScore();
				}else if(num ==3) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자를 올바르게 입력해주세요.");
			} 
		}
	}

	//성적입력
	public void inputScore() throws IOException{
		Score s = new Score();
		System.out.print("이름 : ");
		s.setName(br.readLine());
		s.setKorean(parseInputData("국어 : "));
		s.setEnglish(parseInputData("영어 : "));
		s.setMath(parseInputData("수학 : "));

		list.add(s);
		System.out.println("상품 정보 1건이 추가되었습니다.");
	}

	//입력조건체크
	public int parseInputData(String course) throws IOException{
		while(true) {
			System.out.print(course);
			try {
				int num = Integer.parseInt(br.readLine());
				if(num < 0 || num >100) {
					throw new ScoreValueException("0부터 100까지만 입력가능");
					//System.out.println("0에서 100사이를 입력하시오");
					//continue;
				}
				return num;

			}catch(NumberFormatException e){
				System.out.println("숫자만 입력하세요.");
			}catch(ScoreValueException e ) {
				System.out.println(e.getMessage());
			}
		}
	}



	//성적출력
	public void printScore() throws IOException{
		System.out.println("성적목록 : 총 성적수 (" +list.size() + ")");
		System.out.println("------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("------------------------------------");

		for (Score s : list) {
			System.out.print(s.getName()+"\t");
			System.out.print(s.getKorean()+"\t");
			System.out.print(s.getEnglish()+"\t");
			System.out.print(s.getMath()+"\t");
			System.out.print(s.makeSum()+"\t");
			System.out.printf("%.2f\t",s.makeAvg());
			System.out.println(s.makeGrade()+"\t");
		}
	}









	public static void main(String[] args) {
		new ScoreMain();
	}
}
