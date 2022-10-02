package javaTPC;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		// 상속
		
		//.java .class 를 다 아는 경우
		Dog d = new Dog(); 
		d.eat();
		
		System.out.println("===================================");
		
		Cat c = new Cat(); 
		c.eat();
		c.night();
		
		System.out.println("===================================");
		
		//.class만 아는 경우 
		//dog, cat의 동작방식을 몰라도 animal만 있어도 dog, cat의 클래스를 실행할 수 있다. 
		Animal ani = new Dog(); //upcasting(자동형변화)된 것
		ani.eat();
		
		ani  = new Cat(); 
		ani.eat(); 
		((Cat)ani).night(); //downcasting(강제형변환) 
		
	}

}
