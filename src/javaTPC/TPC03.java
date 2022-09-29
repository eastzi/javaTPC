package javaTPC;

import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// 자료형 - 관계를 이해하라 (기본, 사용자정의)
		// ex) 정수 1개를 저장하기위한 변수를 선언하라.
		int a; 
		a = 10; 
		
		// ex) 책 1권을 저장하기위한 변수를 선언하라 - 사용자정의 자료형으로 book class를 생성하여 선언
		Book b; 
		b = new  Book(); 
		
		b.title = "자바"; 
		b.price  = 15000; 
		b.company =  "한빛미디어";
		b.page = 700; 
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.println(b.company);
		System.out.println(b.page);

		PersonVO p; 
		p = new PersonVO(); 
		p.name = "eastzi";
		p.age = 1111;
		p.weight = 222.2f;
		p.height = 333.3f;
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.height);
	}

}
