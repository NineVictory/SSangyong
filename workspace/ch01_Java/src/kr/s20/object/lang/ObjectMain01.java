package kr.s20.object.lang;

public class ObjectMain01 {
	public static void main(String[] args) {
		ObjectMain01 ob = new ObjectMain01();
		System.out.println(ob.getClass());
		System.out.println(ob.getClass().getName());//클래스명 반환
		System.out.println(ob.hashCode());//10진수의 유니크한 값 반환(object의 해시코드 값을 반환해주는 코드)
							//10진수 -> 16진수(로 변환)
		System.out.println(Integer.toHexString(ob.hashCode()));
		System.out.println(ob.toString());
		System.out.println(ob);//toString을 하지않아도 자동으로 호출됨으로 위에와 같은 값이 나온다.
	}
}
