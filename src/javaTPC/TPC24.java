package javaTPC;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {

	public static void main(String[] args) {
		//2. 다형성 배열
		//Dog와 Cat 타입을 한번에 저장할 배열을 생성하라 -> 부모타입이용
		
		Animal[] ani = new Animal[2]; 
		ani[0] = new Dog();
		ani[1] = new Cat(); 
		
		//1. for문 이용
		for(int i = 0; i < ani.length; i++) {
			ani[i].eat();
			
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();				
			}
		}
		
		//2. 메서드 이용
		display(ani); 

	}

	private static void display(Animal[] ani) {
		for(int i = 0; i < ani.length; i++) {
			ani[i].eat();
			
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();				
			}
		}
		
	}

}
