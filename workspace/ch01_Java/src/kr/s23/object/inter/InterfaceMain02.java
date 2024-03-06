package kr.s23.object.inter;

//인터페이스 -> 형식만 있고 내용이 없음.
//추상메서드만 선언가능. Java 8부터 인터페이스는 default 메서드와 static 메서드를 가질 수 있게 됨.
interface A2{
	//추상메서드
	public abstract void abc(); //원형 (public abstract은 생략가능) 중괄호가 없는 점.  
	void def();
}
//interface안에  추상메서드가 있기 때문에 클래스안에 자식 메서드를 구현해야됨. (추상 클래스는 일반 객체에 사용가능?) 
//"B2 클래스는 A2 인터페이스를 구현한다" 즉 인터페이스를 구현하기 위한 보조역할.
class B2 implements A2 { //implements -> 클래스가 인터페이스를 구현하는 것을 선언하는 데 사용
	//인터페이스의 추상메서드를 구현
	@Override
	public void abc() {
		System.out.println("abc 메서드");
	}
	@Override
	public void def() {
		System.out.println("def 메서드");
	}
}
public class InterfaceMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.abc();
		bp.def();
	}
}
