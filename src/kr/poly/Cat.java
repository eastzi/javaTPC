package kr.poly;

public class Cat extends Animal{
	
	//자식이 부모가 가진 동일 메서드를 재정의(override)한 것 
	@Override
	public void eat() {
		System.out.println("고양이처럼 먹다");
	}
	
	public void night() {
		System.out.println("eye is bright in the night");
	}

}
