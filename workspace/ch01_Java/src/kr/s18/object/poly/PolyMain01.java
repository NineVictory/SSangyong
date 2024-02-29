package kr.s18.object.poly;
//부모클래스
class Parent{
	int a = 100;
}
//자식클래스
class Child extends Parent{
	int b = 200;
}
public class PolyMain01 {
	public static void main(String[] args) {
		Child ch =new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch; //자식클래스 타입에서 부모클래스(Parent)로 바꿈,
					  //업캐스팅, 자동적으로 형변환됨
		System.out.println(p.a);
		//호출범위를 벗어나서 호출 불가. 
		//System.out.println(p.b);//b는 호출이안됨.
		
		//Child ch2 = p; //에러남.
		Child ch2 = (Child)p; //부모클래스타입 -> 자식클래스 타입으로 형변환
							 //다운캐스팅,명시적으로 형변환
	
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
	}
}
