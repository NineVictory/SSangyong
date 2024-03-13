package kr.s27.collection;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MemberMain {
	/*
	 * [실습]
	 * 메뉴:1.회원정보 입력, 2.회원정보 출력, 3.종료
	 * 메서드명 : 메뉴 callMenu()
	 * 		   회원정보 입력 register()
	 * 			회원정보 출력 printUserInfo()
	 * 입력시 조건 체크 : 나이는 1살이상 입력 가능
	 */	
	ArrayList<Member> list; //여기다가 멤버변수 선언하면서 같이 해도되고 아래처럼 생성자 안에 따로 해도 상관없음.
	BufferedReader br;

	public MemberMain() {
		list = new ArrayList<Member>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in) );
			callMenu();  
		}catch(Exception e) {
			e.printStackTrace();//예외 발생 시 스택 트레이스를 출력하는 메서드
		}finally {
			if(br !=null)//입력 스트림이 생성되지 않았거나 이미 닫혔을 경우 null이 될 수 있습니다.
				try {br.close();
				}catch(IOException e) {
				}
		}


	}
	//메뉴
	public void callMenu() throws IOException{
		while(true) {
			System.out.println("메뉴:1.회원정보 입력, 2.회원정보 출력, 3.종료");
			System.out.print("숫자 입력:");
			try {
				int num = Integer.parseInt(br.readLine());//입력 숫자를 받는 것
				if(num ==1) {//회원정보 입력
					register();
				}else if(num == 2) {//회원정보 출력
					printUserInfo();
				}else if(num == 3) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");  
				}
				
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요!");
			}
		}
	}
	//회원정보 입력
	public void register() throws IOException{
		Member m = new Member();
		System.out.print("이름 : ");
		m.setName(br.readLine());
		
		m.setAge(parseIntData("나이 : "));
		
		System.out.print("직업 : ");
		m.setJob(br.readLine());
		
		System.out.print("주소 : ");
		m.setAddress(br.readLine());
		
		System.out.print("전화번호 : ");
		m.setPhone(br.readLine());
		
		//Member 객체를 ArrayList에 저장
		list.add(m);
		System.out.println("회원정보를 1건 추가했습니다.");
	}
	//나이 조건 체크								
	public int parseIntData(String item) throws IOException{//readLine을 쓰기위해선 IOException을 넣어줘야됨. 오류를 적기위해
		while(true) {
			System.out.print(item);//위에 register의 나이: 를 받아옴
			try {
				int age = Integer.parseInt(br.readLine());
				if(age <=0) {
					System.out.println("나이는 1살이상 입력 가능");
					continue; //잘못 입력한 것이기 때문에 빠져나가지 못하도록 continue;
				}
				return age; //정상입력인 1살이상 입력시 탈출 하고 리턴하도록함.
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능");//잘못입력하면 계속 돌도록 while 안에 넣은것
			}
		}
	}
	//회원정보 출력
	public void printUserInfo() throws IOException{
		System.out.println("회원목록 : 총 회원수 (" +list.size() + ")");
		System.out.println("------------------------------------");
		System.out.println("이름\t나이\t직업\t주소\t전화번호");
		System.out.println("------------------------------------");
		
		for(Member m : list) {
			System.out.printf("%s\t",m.getName());
			System.out.printf("%d\t",m.getAge());
			System.out.printf("%s원\t",m.getJob());
			System.out.printf("%s\t",m.getAddress());
			System.out.printf("%s%n",m.getPhone());
		}
	}
	
	
	
	
	public static void main(String[] args) {
		new MemberMain();//MemberMain()(20번줄)생성자를 호출하는 객체를 생성 
	}
}
