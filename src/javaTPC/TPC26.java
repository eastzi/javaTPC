package javaTPC;

import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {

	public static void main(String[] args) {
		//다형성 - 인터페이스 
		
		/* 인터페이스는 객체생성 불가
		RemoCon r = new RemoCon(); 
		*/
		
		RemoCon r = new TV(); 
		r.chUp();
		r.chDown();
		r.internet();
		
		r = new Radio(); 
		r.chUp();
		r.chDown();
		r.internet();
	}

}
