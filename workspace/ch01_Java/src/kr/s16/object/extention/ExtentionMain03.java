package kr.s16.object.extention;

//부모클래스
class A{
	int x = 100;
	private int y =200;
	
	public int getY() {
		return y;
	}
	
}
//자식클래스
class B extends A{
	int z = 300;
}
public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp = new B();
		
		System.out.println(bp.x);
		System.out.println(bp.getY());//그냥 y는 불가능. y는 private이기 때문에 get메서드를 만든다음호출해야됨
		System.out.println(bp.z);
	}
}
