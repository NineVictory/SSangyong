package kr.s24.object.enumtest;

enum Gender {
	MALE,FEMAIL; //메서드가 없는 경우는 세미콜론 생략이 가능하지만 메서드를 쓸 경우에는 세미콜론을 사용해야됨.
	
	//메소드 재정의
	@Override
	public String toString() {
		switch(this) { //객체 자신을 참조하는 this 사용
		case MALE:
			return "남자";
		default :
			return "여자";
		}
	}
}
public class EnumMain03 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE); //위에 메서드에서 toString()을 사용했기 때문에 안써도 출력가능. 
		System.out.println(Gender.FEMAIL);
		System.out.println("--------------");
		System.out.println(Gender.MALE.toString());
		System.out.println(Gender.FEMAIL.toString());
	}
}
