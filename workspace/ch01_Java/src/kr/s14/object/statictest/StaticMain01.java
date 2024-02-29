package kr.s14.object.statictest;

public class StaticMain01 {
	public static void main(String[] args) {
		StaticCount sc1 = new StaticCount();
		System.out.println("c :"+sc1.c + ", count :"+ StaticCount.count);
													//sc1.count라고 해도 에러는 안나지만 
													//스태틱을 사용할 땐 정상적인 호출방법이 아님
													//클래스 명을 붙이는게 가장 이상적인 방법.
		StaticCount sc2 = new StaticCount();
		System.out.println("c :"+sc2.c +", count :"+StaticCount.count);
		
		StaticCount sc3 = new StaticCount();
		System.out.println("c :"+sc3.c +", count :"+StaticCount.count);
		
	}   
}
