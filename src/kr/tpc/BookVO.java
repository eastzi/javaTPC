package kr.tpc;

//책(object) -> 제목, 가격, 회사, 페이지수 등 
public class BookVO {
	public  String title;
	public int price;
	public String company; 
	public int page; 
	
	//기본 생성자 생략됨. 
	
	public BookVO() { //이 생성자를 사용하면 몇개의 객체를 생성해도 초기화 값이 동일
		//초기화 작업
		this.title = "자바";
		this.price = 10000;
		this.company = "이지스";
		this.page = 800; 
	}
	
	//객체를 생성함과 동시에 각 객체마다 다른 초기화 값을 가지게 됨. 
	//=>  오버로딩  
	public BookVO(String title, int price, String company, int page) {
		this.title = title; 
		this.price = price; 
		this.company = company; 
		this.page = page; 
	}
}
