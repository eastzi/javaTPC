package javaTPC;

import kr.tpc.MovieVo;

public class TPC17 {

	public static void main(String[] args) {
		// 배열과 클레스 관계
		
		//배열이용
		int[] a = new int[5];
		a[0] = 10; 
		a[1] = 20;
		a[2] = 30; 
		a[3] = 40; 
		a[4] = 50;
		
		int[] b = {10, 20, 30, 40, 50};
		
		int[] c = new int[] {10, 20, 30, 40, 50}; 
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		//class 이용
		//영화 데이터(제목, 가격, 주인공, 등급, 시간) 
		MovieVo mv = new MovieVo("친구", 12000, "연기자", 12, 1.3f); 
		System.out.println(mv.toString());

		System.out.println("-----------------------------------------------------------------------");
		
		//3편의 영화를 저장
		MovieVo[] marr = new MovieVo[3]; 
		marr[0] = new MovieVo("친구1", 12000, "연기자1", 12, 1.3f);
		marr[1] = new MovieVo("친구2", 13000, "연기자2", 13, 1.4f);
		marr[2] = new MovieVo("친구3", 14000, "연기자3", 14, 1.5f);
		
		System.out.println(marr[0].toString());
		System.out.println(marr[1].toString());
		System.out.println(marr[2].toString());
		
		System.out.println("-----------------------------------------------------------------------");
		
		for(int i = 0; i < marr.length; i++) {
			System.out.println(marr[i]);
		}
	}

}
