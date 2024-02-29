package kr.s15.object.thistest;

public class ThisMain03 {
	//생성자
	public ThisMain03() {
		/*
		 * 생성자 내부에서 또 다른 생성자를 호출 할 때 this()를 사용한다.
		 * 반복적인 코드를 제거하고 코드를 재사용하기 위해 또다른 생성자를 
		 * 호출해서 동작시킴
		 */
		//System.out.println("-----"); //this() 전에 코드를 쓰면 에러가 난다.
		this("여름");//생성자 안에서 또다른 생성자를 호출할 때 사용
		System.out.println("~~~~~~~");
	}
	public ThisMain03(String msg) {
		System.out.println(msg);
	}
	public ThisMain03(int a) {
		this(String.valueOf(a)); //valueOf 는 static이기 때문에 String.valueOf을 사용
	}							//글씨가 이탈리안식처럼 기울어있으면 static임
	public static void main(String[] args) {
		ThisMain03 tm = new ThisMain03();
		ThisMain03 tm2 = new ThisMain03("겨울");
		ThisMain03 tm3 = new ThisMain03(50000);
	}
}
