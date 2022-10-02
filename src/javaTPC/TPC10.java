package javaTPC;

import kr.tpc.BookDto;

public class TPC10 {

	public static void main(String[] args) {
		// 기본 자료형 - int, float, char, boolean
		int a;
		a = 10; 
		
		// 사용자 정의 자료형
		BookDto b; // BookDto 라는 자료형을 class로 생성해야함. 
		b = new BookDto(); 
		
		b.title = "자바";
		b.price = 111111;
		b.company = "JAVA"; 
		b.page = 333;
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page + "\t");
		
	}

}
