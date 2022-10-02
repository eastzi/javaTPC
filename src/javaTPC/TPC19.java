package javaTPC;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {

	public static void main(String[] args) {
		// DOG, CAT class 설계 후 animal 상속 
		
		Dog d = new Dog(); 
		d.eat();
		
		Cat c = new Cat(); 
		c.eat(); 

		//Dog.java 소스파일 없이 Dog.class파일만 있어도 동작이 가능하도록
		//리모컨 같은 역할을 하는 class가 필요하다. 
		//리모컨을 통해서 도구가 동작하도록 class를 설계
		
		//Animal <----- [Dog.class, Cat.class]
		Animal ani = new Dog(); 
		ani.eat(); 
		
		ani = new Cat(); 
		ani.eat();
	}

}
