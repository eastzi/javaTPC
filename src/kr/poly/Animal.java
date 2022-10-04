package kr.poly;

public abstract class Animal{ //추상클레스(불완전한 클레스) -> 객체생성 불가. 부모역할만 함.
	//Dog, Cat -> eat(); 
	public abstract void eat(); //-> 추상메서드(불완전한 메서드) -> 자식클레스에서 재정의 반드시 필요!!

	//구현메서드 -> 이 메서드 때문에 추상과 인터페이스의 차이가 남. 
	//기능이 비슷해서 구현메서드가 사용가능하다 -> 추상클레스
	//기능이 비슷하지않아 구현메서드 사용이 불가하다 -> 인터페이스 
	public void move() { 
		System.out.println("무리를 지어서 이동한다.");
	}
}
