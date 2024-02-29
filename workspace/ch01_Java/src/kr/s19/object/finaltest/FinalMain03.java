package kr.s19.object.finaltest;
//class에 final을 붙임.
//class에 final을 명시하면 상속 불가능
final class Me1{
	int var;
	public void setVar(int var) {
		this.var = var;
	}
}
//public class FinalMain03 extends Me1 { //상속이 불가능해서 Me1 부분에 에러가 난다.
public class FinalMain03{
	public static void main(String[] args) {
		FinalMain03 fm = new FinalMain03();
		//fm.setVar(1000); //이역시 상속이 불가능하여 에러가난다.
	}
}
