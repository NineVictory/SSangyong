package kr.s01.basic;

public class PrintMain07 {
	public static void main(String[] args) {
		
		/*
		 * [실습]
		 * 유재성은 은행계좌를 가지고 있다. 계좌의 1,000원이 예금되어
		 * 있는데 오늘 325원을 송급 받아서 잔고가 1,325이 되었다.
		 * 특별이자율은 0.3 이 적용되어 내일 이자 397.5원을 받는다
		 * 에금자, 송금되기전 잔금, 송금된 금액, 송금이후 잔금
		 * 내일 입글 될 이자를 출력하시오
		 */
		
		System.out.printf("%s : %s%n%s : %,d%n%s : %,d%n%s : %,d%n%s : %.1f%n", 
				          "입금자","유재석", "송금되기전 잔금", 1000, "송금 된 금액", 325,"송금이후 잔금", 1325, "내일 입금 될 이자", 397.5);

		System.out.println("----------------------------------");
		
	    System.out.printf("%-10s : %s%n", "입금자", "유재석");
	    System.out.printf("%-10s : %,d%n", "송금되기전 잔금", 1000);
	    System.out.printf("%-10s : %,d%n", "송금 된 금액", 325);
        System.out.printf("%-10s : %,d%n", "송금 이후 잔금",1325);
        System.out.printf("%-10s : %.1f%n", "내일 입금 될 이자", 397.5);
        
        
       
	}

}
