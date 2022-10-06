package javaTPC;

import java.util.ArrayList;

import kr.inflearn.ObjectArray;
import kr.tpc.A;
import kr.tpc.B;

public class TPC37 {

	public static void main(String[] args) {
		// ArrayList
		//ObjectArray arr = new ObjectArray(5);
		ArrayList arr = new ArrayList(5); //내부에 object[]을 가지면서, 배열의 길이에 제약이 없다.
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		arr.add(new B());
		arr.add(new B());
		arr.add(new B());
		arr.add(new B());

		for(int i = 0; i < arr.size(); i++) {
			Object o = arr.get(i); 
			if(o instanceof A) {
				((A)o).go();
			}else {
				((B)o).go();
			}
		}
	}

}
