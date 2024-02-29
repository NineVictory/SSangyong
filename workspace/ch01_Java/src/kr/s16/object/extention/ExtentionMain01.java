package kr.s16.object.extention;

//부모클래스
class Parent{
	int a =100;
}
class Child extends Parent{
	int b = 200;
}


public class ExtentionMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);//parent의 a
		System.out.println(ch.b);//child의 b
	}
}
