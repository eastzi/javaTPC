package javaTPC;

import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27 {

	public static void main(String[] args) {
		// RemoCon 으로 TV클레스를 구동하라. 
		RemoCon r = new TV(); 
		
		for(int i = 0; i < 40; i++) {
			r.chUp();			
		}
		
		for(int i = 0; i < 40; i++) {
			r.chDown();		
		}
		
		r.internet();

	}

}
