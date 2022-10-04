package javaTPC;

import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {

	public static void main(String[] args) {
		//1. 다형성 - 추상클레스
		
		/* 추상클레스가 되면서 객체생성 불가. 부모역할만 함. -> 다형성 보장 용도 
		Animal ani = new Animal(); 
		ani.eat();
		*/
		
		Animal ani2 = new Dog(); 
		ani2.eat();
		ani2.move();
		
		System.out.println("=======================================");

		ani2 = new Cat(); 
		ani2.eat();
		ani2.move();
		((Cat)ani2).night(); //다운케스팅

	}

}
