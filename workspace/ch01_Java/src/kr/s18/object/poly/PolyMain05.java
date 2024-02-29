package kr.s18.object.poly;

//부모클래스
class Parent3 {
	//object의 toString을 재정의
	@Override
	public String toString() {
		return "Parent 클래스";
	}
}
//자식클래스
class Child3 extends Parent3{
	@Override
	public String toString() {
		return "Child3 클래스";
	}
}
public class PolyMain05 {
	public static void main(String[] args) {
		Parent3 p = new Parent3();
		
		//컴파일시 오류는 없지만 실행시 오류가 발생. 자식클래스의 객체를 생성하지않는 실수를 함.
		//Child3 ch = (Child3)p;
		
		
		//instanceof 연산자는 상속관계일 때 사용(우리가 상속관계인걸 알고있는 상태에서만 사용해야됨. 상속관계인지 몰라서 알아내기 위해 사용하는 것은 아님)
		//좌측에 지정한 객체가 우측에 지정한 타입을 사용할 수 있는지 검증하는 연산자. 사용 가능하면 true,불가능하면 false
		//객체(p)			타입(Child3)
		if(p instanceof Child3) {
			Child3 ch2 = (Child3)p;
			System.out.println(ch2);
			System.out.println("-----------------------------");
			
		}else {
			System.out.println(p);
			System.out.println("+++++++++++++++++++++++++++++");
		}
	}
}
