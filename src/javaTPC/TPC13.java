package javaTPC;

import kr.tpc.BookDto;

public class TPC13 {

	public static void main(String[] args) {
		//DTO - 데이터 이동 
		// 책 -> class(BookDTO) -> 객체 -> 인스턴스 
		// 책이라는 객체의 상세정보(4개의 변수) -> 데이터를 이동하기위해 묶음이 필요
		// -> 배열 또는 직접설계를 통해 묶음. 타입이 달라 배열사용은 불가함. class를 통해 직접설계
		String title = "스프링"; 
		int price = 25000; 
		String company = "제이펍";  
		int page = 300; 
		
		BookDto dto; //아직은 구체화되지 않은 object 상태. 
		dto = new BookDto(title, price, company, page); //dto는 구체화된 instance(변수) 상태. 

		bookPrint(dto);
	}
	
	public static void bookPrint(BookDto dto) {
		System.out.println(dto.title);
		System.out.println(dto.price);
		System.out.println(dto.company);
		System.out.println(dto.page);
	}
	
}
