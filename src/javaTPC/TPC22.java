package javaTPC;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {

	public static void main(String[] args) {
		// 객체 형 변환
		// upcasting 
		// Cat ani = new Cat(); 
		//Object ani = new Cat(); 
		
		Animal ani = new Cat(); 
		ani.eat(); //컴파일시점 - animal eat(), 실행시점 - cat eat()
		
		//ani.night(); 
		//Cat c = (Cat)ani; 
		//c.night(); 
		((Cat)ani).night(); 
		
		System.out.println("=============================================");
		
		ani = new Dog(); 
		ani.eat();
		
		//다형성
		// 상위클레스가 하위클레스에게 동일한 메세지로 서로 다르게 동작시키는 원리 
		
		System.out.println("=============================================");
		
		Object o = new Dog(); 
		//o.eat(); 
		((Dog)o).eat(); 
		
	}

}
