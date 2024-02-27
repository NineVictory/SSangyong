package kr.s13.object.array;

class Book{
	private String category;
	private String name;
	private int price;
	private double discount;
	
	//생성자
	public Book(String c , String n ,int p ,double d) {
		category = c;
		name = n;
		price = p;
		discount = d;
	}
	//private 때문에 캡슐화 시킴
	public String getCategory() {
		return category;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
}
public class BookMain {
	public static void main(String[] args) {
		Book[] bookArray = new Book[3];
		//Book 객체를 3개 생성하여 배열에 저장
		bookArray[0] = new Book("IT","Java",50000,0.05);
		bookArray[1] = new Book("IT","Oracle",40000,0.03);
		bookArray[2] = new Book("미술","반고흐",60000,0.06);
		
		//반복문을 이용해서 객체의 요소 출력
		for(int i =0; i<bookArray.length ; i++) {
			System.out.printf("%s\t ",bookArray[i].getCategory());
			System.out.printf("%s\t ",bookArray[i].getName());
			System.out.printf("%,d원\t ",bookArray[i].getPrice());
			System.out.printf("%.2f%n",bookArray[i].getDiscount());
			
		}  
	}
}
