package javaTPC;

import kr.tpc.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		//책 1권을 저장하기 위한 객체를 생서하라
		//1. 직접 접근하는 방법 
		BookVO b = new BookVO(); 
		
		b.title = "파이썬"; 
		b.price = 100000; 
		b.company = "에이오"; 
		b.page = 400; 
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page + "\t");
		
		BookVO b1 = new BookVO(); 
		
		b.title = "오라클"; 
		b.price = 200000; 
		b.company = "한빛"; 
		b.page = 200; 
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page + "\t");
	}
}
