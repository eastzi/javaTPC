package javaTPC;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {

	public static void main(String[] args) {
		// 상속 = 재정의
		
		Dog d = new Dog(); 
		d.eat();
		
		Cat c = new Cat(); 
		c.eat();
		c.night();
		
		System.out.println("=========================================");
		
		Animal ani = new Dog(); //부모객체가 먼저 생성되고 자식이 생성됨. 
		ani.eat();
		
		ani = new Cat();
		ani.eat(); 
		//부모클래스에 없는 메서드이기 때문에 다운캐스팅으로 사용 
		((Cat)ani).night(); 
	}

}
