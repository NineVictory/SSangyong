package kr.s07.object.method;

class Worker {
	/*
	 * [실습]
	 * Worker
	 * 1)멤버 변수: 직원이름(name),급여(money),계좌잔고(balance)
	 * 2)멤버 메서드: work(실행하면 money에 1000원 누적)
	 * 					deposite(실행하면 money에 저장된 돈을 
	 * 					balance에 누적시키고 money는 0처리)
	 * WorkerMain의 main
	 * 1)Worker 객체 생성
	 * 2)직원의 이름 지정
	 * 3)10번 일하는데 번 돈이 3000원일 때 마다 계좌에 저축
	 * 4)직원 이름, 현재 계좌에 입금되지 않고 남아있는 급여(money),
	 * 계좌 잔고(balance)를 출력하시오.
	 */
	String name;
	int money;
	int balance;
	
	public void work() {//일하는 메서드
		money +=1000; 
	}
	
	public void deposite() {//저축하는 메서드
		balance += money;
		money = 0;
	}
	
}	
public class WorkerMain {
	public static void main(String[] args) {
		
		Worker wk = new Worker();
		
		wk.name = "구승회";
		//10번 일하는데 번 돈이 3000원이 되면 저축
		for (int i =0 ; i <10; i++) {
			wk.work();
			if (wk.money ==3000) {//wk.money%3000==0 도 가능
				wk.deposite();
			}
			
		}
		System.out.println("직원이름:"+wk.name);
		System.out.println("현재 계좌에 입금되지 않고 남아있는 급여:"+wk.money);
		System.out.println("계좌잔고:"+wk.balance);
	}
}
  