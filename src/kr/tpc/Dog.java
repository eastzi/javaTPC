package kr.tpc;

public class Dog extends Animal{
	//상태정보 - 이름, 나이, 종 등 
	//행위정보 - eat() -> 상속의 주 대상
	
	//자식이 부모가 가진 동일 메서드를 재정의(override)한 것 
	@Override
	public void eat() {
		System.out.println("개처럼 먹다");
	}
	
	public Dog() {
		//dog()를 통해 객체를 생성할 수 있게 되면 super는 부모클래스의 생성자를 호출하게 함.
		super();  
	}
}
