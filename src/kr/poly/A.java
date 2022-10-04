package kr.poly;

public class A extends Object{
	
	public A() {
		super(); 
	}
	
	public void display() {
		System.out.println("나는 a이다.");
	}

	@Override
	public String toString() {
		return "나는 재정의된 메서드 입니다.";
	}
	
	
}
