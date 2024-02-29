package kr.s15.object.thistest;

public class Animal {

	private String name;
	private int age;
	private boolean fly;
	
	//생성자
	public Animal() {
		
	}
	public Animal(String name, int age, boolean fly) {
		this.name = name;
		this.age = age;
		this.fly = fly;
		
	}
	//멤버 메서드
	//일일히 안치고 바로 get/set 메서드 만드는 방법
	//우클릭 source -> generate getters and setters
		//후 모두선택 하면 generate
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFly() {//boolean은 get보단 is라고 씀
		return fly;
	}
	public void setFly(boolean fly) { 
		this.fly = fly;
	}
	
	
	
	

	
	
	
	
	
}
