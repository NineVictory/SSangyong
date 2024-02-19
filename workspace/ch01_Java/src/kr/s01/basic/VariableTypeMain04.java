package kr.s01.basic;

public class VariableTypeMain04 {
	public static void main(String[] args) {
		System.out.println("===명시적 형변환(강제 형변환)===");
		//더 작은 자료형으로 강등이 일어나는 형태, 정보의 손실이 발생할 수 있음.
		byte b1 = 127;
		byte b2 =127;
		byte result1 = (byte) (b1+b2); //(b1+b2)는 int형으로 자동으로 형변환된 것을 다시 byte로 강제 형변환함.
		
		System.out.println("result1 = "+ result1);  //결과값이 -2 로 완전 왜곡됨.
		
		short s1 = 32767;
		short s2 = 32767;
		//32bit 미만 short형 데이터를 연산하면 자동으로 32bit로 변환
						//자동적으로 int형으로 형변환 된 것을 다시 short로 강제 형변환
		short result2 = (short) (s1+s2);
		
		System.out.println("result2 = "+ result2);
		
		float f1 = 3.14f;
		int in1 = 15;
					  //f1: float -> int강제 형변환
		int result3 = (int)(f1 +in1);
		
		System.out.println("result3 = "+ result3); //정수로 형변환을 했기 때문에 18.14가 아닌 18로 0.14가 손실됨.
		
		long lg1 =1234L;
		int in2 = 59;
					  //lg1 : long -> int 강제 형변환
		int result4 = (int) (lg1 +in2);
     		System.out.println("result4 = "+ result4);
     		
     		
	}
}
