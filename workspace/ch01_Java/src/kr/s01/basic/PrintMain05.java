package kr.s01.basic;

public class PrintMain05 {
	public static void main(String[] args) {
		// System.out.printf(포맷문,데이터)를 이용한 출력
		// (데이터의 종류를 표시할 수 있는 포맷문자 지원)
		
		// 문자
		               //포맷문자  전달 될 데이터,  
		System.out.printf("%c%n",'A');       // %n은 줄바꿈
		System.out.printf("%c%n",'B');      // 6자리 확보, 오른쪽에 정렬
		System.out.printf("%-6c%n", 'C');    // 6자리 확보, 왼쪽에 정렬
		
		System.out.println("=========");
		
		//정수
		System.out.printf("%d%n", 67);       // %d : 정수를 의미
		System.out.printf("%,d%n", 100000);  // , : 3자리 단위로 ,출력
		System.out.printf("%5d%n", 20);      // 5자리 확보, 오른쪽에 정렬
		System.out.printf("%-5d%n", 20);     // 5자리 확보, 왼쪽에 정렬
		
		System.out.println("=========");
		
		//실수
		System.out.printf("%f%n", 35.896);   // %f : 소숫점 자리 6자리 확보, 비어있는 자리는 0으로 채움
		System.out.printf("%.2f%n", 35.896); // %.nf : n + 1 자리에서 반올림
		//10자리를 확보하고 오른쪽에 표시, 소숫점 둘째자리까지 출력
		System.out.printf("%10.2f%n", 35.896);
		
		System.out.println("=========");
		
		//문자열
		System.out.printf("%s%n", "우주");
		System.out.printf("%5s%n", "하늘");
		System.out.printf("%-5s%n", "지구");
		
		System.out.println("=========");
		
		//논리값
		System.out.printf("%b%n", true);
		
		//데이터의 종류가 여러개일 경우
		System.out.printf("%s는 %d점입니다.%n","점수", 98);
		System.out.printf("중간고사 성적은 총점 %d%n평균 %.2f 입니다.", 254, 84.67);
	    
	}

}
