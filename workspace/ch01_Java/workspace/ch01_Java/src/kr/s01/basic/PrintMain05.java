package kr.s01.basic;

public class PrintMain05 {
	public static void main(String[] args) {
		//System.out.printf(포멧문자,데이터)를 이용한 출력
		//(데이터의 종류를 표시할 수 있는 포멧문자를 지원)
		
		//문자			 /포멧문자 전달될 데이터
		System.out.printf("%c%n", 'A'); // %c = 문자 %n = 줄바꿈
		System.out.printf("%6c%n", 'B');// %와 c 사이에 6을 넣으면 출력하기위해 6자리 확보, 오른쪽에 정렬
		System.out.printf("%-6c%n", 'B');// 6자리확보, 왼쪽에 정렬하려면 음수를 명시
		
		System.out.println("========================================");
		
		//정수
		System.out.printf("%d%n",67); //%는 정수를 의미
		System.out.printf("%,d%n",1000000000); // %와 d사이에 쉼표(,)를 넣어주면 3자리마다 쉼표가 생김
		System.out.printf("%5d%n",20); //5자리 확보, 오른쪽 정렬
		System.out.printf("%-5d%n",20);
		
		//실수
		System.out.printf("%f%n",35.896);//소수점 자리는 기본적으로 6자리 확보, 비어 있는 자리는 0으로 채움
		System.out.printf("%.2f%n", 35.896);// .2를 쓰면 소수점 둘째자리까지 출력(셋째자리에서 반올림) 
		System.out.printf("%10.2f%n", 35.896); //10자리를 확보하고 오른쪽에 표시, 소수점 둘째 자리까지 출력
		
		System.out.println("========================================");
		
		//문자열
		System.out.printf("%s%n", "우주");
		System.out.printf("%5s%n", "하늘");//5자리 확보, 오른쪽 정렬
		System.out.printf("%-5s%n","지구");//5자리 확보, 왼쪽 정렬
		
		//논리값
		System.out.printf("%b%n","true");
		}
}
