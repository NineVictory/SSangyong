package kr.s20.object.lang;
/*
 * 문자열 - 명시적으로 객체
 * String s = new String("하늘);
 * String s3 = new String("하늘);
 *메모리 안에 하늘이라는 객체가 각자 생성된다.(2개의 하늘 객체가 메모리에 들어감)
 * 
 * 문자열 - 암시적으로 객체
 * String s2 = "바다";
 * String s4 = "바다";
 * 메모리 안에는 바다라는 한 개의 객체를 s2와 s4가 서로 공유한다.(바다 라는 객체 1개만 존재)
 */
public class SpringMain01 {
	public static void main(String[] args) {
		//암시적으로 문자열 생성
		//같은 문자열을 사용할 경우 객체를 공유
		String str1 = "abc";
		String str2 = "abc";

		//객체 비교
		if(str1 == str2) {
			System.out.println("str1과 st2는 같은 객체"); //암시적으로 객체를 만들면 한 개 객체를 서로 공유하기 때문 
		}else {
			System.out.println("str1과 str2는 다른 객체");
		}

		//문자열 비교
		if(str1.equals(str2)) {
			System.out.println("str1과 str2의 내용이 같다.");//객체도 같고 문자열도 같다.
		}else {
			System.out.println("str1과 str2의 내용이 다르다");
		}
		System.out.println("------------------");

		//명시적으로 문자열 생성(문자열이 같아도 객체를 따로만든다)
		//같은 문자열을 사용해도 객체를 따로 생성(공유X)
		String str3 = new String("Hello");
		String str4 = new String("Hello");//자바는 대소문자를 구분하기 때문에 hello로 쓴다면 문자열도 달라진다.
/////////////////////////////////////////////////////////////////////////////////////////////////////
		//객체 비교
		if(str3 == str4) { //hello라는 문자가 같은지를 비교한것이 아닌 메모리안에 있는 객체가 같은지를 확인하는 방법.
			System.out.println("str3과 st4는 같은 객체");
		}else {
			System.out.println("str3과 str4는 다른 객체");

		}

		//문자열 비교
		if(str3.equals(str4)) {
			System.out.println("str3과 str4의 내용이 같다.");//객체는 다르지만 문자열은 같다.
		}else {
			System.out.println("str3과 str4의 내용이 다르다");
		}
		System.out.println("------------------");
		
		String str5 = "bus";
		String str6 = "BUS";
//////////////////////////////////////////////////////////////////////////////////////////////////
		//대소문자 구분하지 않고 문자열 비교
		//(변수.equalsIgnoreCase(비교 할 변수))
		if(str5.equalsIgnoreCase(str6)) {
			System.out.println("[대소문자 구분없이 비교]str5와 str6의 내용이 같다");
		}else {
			System.out.println("[대소문자 구분없이 비교]str5와 str6의 내용이 다르다");
		}
	}
}
