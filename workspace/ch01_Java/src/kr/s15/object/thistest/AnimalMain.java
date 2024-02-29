package kr.s15.object.thistest;

public class AnimalMain {
	/*
	 * [실습]
	 * Animal
	 * 멤버변수: 이름(name),나이(int age),비행여부(fly <true false>) - 은닉화(private) get메소드 쓰라는뜻
	 * 멤버 메서드: public set/get 메서드를 정의
	 * 생성자:인자가 있는 생성자, 인자가 없는 생성자   
	 * AnimalMain
	 * 
	 * 인자가 있는 생성자를 이용해서 객체 생성(까치 코끼리 사자 등등 )
	 * 이름,나이,비행여부를 출력, 비행여부는 true/false -> 가능/불가능 으로 출력
	 * 
	 * 인자가 없는 생성자를 이용해서 객체 생성
	 * 이름,나이,비행여부 설정
	 * 이름,나이,비행여부를 출력, 비행여부 true/false -> 가능/불가
	 */
	
	
	public static void main(String[] args) {
		//인자가 있는 생성자를 이용해서 객체를 생성
		Animal a1 = new Animal("기러기",3,true);
		

		System.out.println("이름 : "+a1.getName()+"\n"
							+"나이 : "+a1.getAge()+"\n"
							+"비행여부 : " + (a1.isFly() ? "가능":"불가능"));
		//static을 활용한 것을 호출
		System.out.println("------------------------------------------");
		System.out.println("비행여부:"+printFly(a1.isFly()));
		System.out.println("------------------------------------------");
		//인자가 없는 생성자를 이용해서 객체를 생성
		Animal a2 = new Animal();
		a2.setName("기린");
		a2.setAge(12);
		a2.setFly(false);
		
		System.out.println("이름 : "+a2.getName()+"\n"
				+"나이 : "+a2.getAge()+"\n"
				+"비행여부 : " + (a2.isFly() ? "가능":"불가능"));
		//static을 활용한 것을 호출
		System.out.println("------------------------------------------");
		System.out.println("비행여부:"+printFly(a2.isFly()));
		System.out.println("------------------------------------------");
		                     
	}
	//객체생성 없이 호출하는 법 -> static 사용
	private static String printFly(boolean fly) {
		return fly ? "가능":"불가능";
	}
}
