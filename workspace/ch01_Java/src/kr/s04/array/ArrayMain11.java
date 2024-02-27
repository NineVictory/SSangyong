package kr.s04.array;

public class ArrayMain11 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * double 형인 배열의 모든 요소의 합과 평균을 구하는 프로그램을 작성하시오
		 * 
		 * [입력 예시]
		 * 요소의 수 > 3
		 * a[0] = 2.2
		 * a[1] = 2.2
		 * a[2] = 3.3
		 * 
		 * [출력 예시]
		 * 모든 요소의 합 : 7.7 System.out.println()
		 * 모든 요소의 편균 : 2.57 System.out.prinf()
		 * 
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.print("요소의 수 : ");
		int num = input.nextInt();
		double sum = 0;
		double a[] = new double[num];
		
		for(int i = 0; i < a.length; i++) {
		System.out.print("a["+i+"] : ");
		double b = input.nextDouble();
		a[i] = b;
		sum += a[i];
		}
		System.out.println("모든 요소의 합 : "+sum);
		System.out.printf("모든 요소의 평균 : %.2f", (sum / a.length));
		input.close();
	}
}