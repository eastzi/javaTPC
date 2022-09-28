package kr.bit;

/*
사용자정의 자료형으로 사용하기 위해 설계필요 - 하나의 구조로(덩어리 = 객체) 만들어야 함. 
책이라는 객체의 상태정보를 저장 - 제목, 가격, 출판사, 페이지수 등
행위정보는 동작으로 메소드를 통해 저장 
*/
public class Book {
	public String title;
	public int price; 
	public String company; 
	public int page; 
}
