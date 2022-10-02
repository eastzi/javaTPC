package kr.tpc;

public class BookDto {
	public String title;
	public int price;
	public String company; 
	public int page; 
	
	//디폴트 생성자 메서드 생략되어 있음 
	public BookDto() {
		// 객체를 생성하는 작업을 함. 
		// 생성과 동시에 this라는 객체도 생성됨. - 핵심. 
	}

	public BookDto(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
