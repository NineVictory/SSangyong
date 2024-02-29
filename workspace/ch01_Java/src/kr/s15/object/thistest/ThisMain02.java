package kr.s15.object.thistest;
/*
class ThisTest{
	//은닉화
	private int a;//멤버 변수
	//캡슐화
	public void setA(int a) { //지역변수 a
		a = a;
	//지역변수 = 지역변수 로 인식 why? 멤버변수와 이름이 같기 때문에. 이름이 같으면 지역변수가 우선시됨.
	}
	public int getA() {
		return a;
	}
}
*/
class ThisTest{
	//은닉화
	private int a;//멤버 변수
	//캡슐화
	public void setA(int a) { //지역변수 a
	//  멤버변수 = 지역변수	
		this.a = a; //this를 쓰면 a가 지역변수에서 멤버변수로 변경됨
	}
	public int getA() {
		return a;
	}
}

public class ThisMain02 {
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(10);
		System.out.println(tt.getA());
	}

}
