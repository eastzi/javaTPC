package javaTPC;

import kr.tpc.A;
import kr.tpc.B;

public class TPC29 {

	public static void main(String[] args) {
		// object class 다형성 인수 사용 
		
		A a = new A(); 
		display(a); 
		
		B b = new B(); 
		display(b); 

	}

	private static void display(Object o) {
		if(o instanceof A) {
			((A)o).go();			
		}else {
			((B)o).go();
		}
	}
	
	

}
