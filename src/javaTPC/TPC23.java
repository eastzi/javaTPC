package javaTPC;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {

	public static void main(String[] args) {
		//  1. 다형성 인수
		Dog d = new Dog(); 
		display(d); 
		Cat c = new Cat(); 
		display(c); 

	}

	//1. display method 2개 생성(오버로딩) -> 객체가 늘어나면 메서드가 늘어나서 확정에 어려움이 생김
	// -> 1개의 display로 만들자! -> 매개변수를 부모타입으로 받아라
	private static void display(Animal ani) {//animal이 한번은 dog타입, 한번은 cat타입을 받음
		
		/*2. dog와 cat클래스에 구현된 eat( ) 메소드의 내용이 출력되는데 dog를 타입으로 받을 때 night() 메소드가
		존재하지 않으므로 오류가 발생함. 때문에 if로 조건을 걸어줌. 
	    -> dog클레스에는 night() method가 없음 -> 오류발생 -> cat타입인 경우에만 메서드를 받도로 if문으로 조건걸기
		*/
		ani.eat(); 
		
		//3. cat타입인 경우에만 가능. 조건걸기 
		//ani.night(); 
		if(ani instanceof Cat) {
			((Cat)ani).night();			
		}
	}


}
