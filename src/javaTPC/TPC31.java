package javaTPC;

import kr.tpc.Inflearn;

public class TPC31 {

	public static void main(String[] args) {
		//public 생성자
//		Inflearn inf = new Inflearn(); 
//		inf.tpc();
//		inf.java();
		
		//static 메서드 - 객체 생성없이 클래스이름으로 접근 
		// + 추가로 객체를 생성할 수 없게 private으로 생성자를 만들고
		//static메서드를 클래스이름으로 접근 
		Inflearn.java(); 
		Inflearn.tpc();  
	}

}
