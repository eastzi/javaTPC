package javaTPC;

public class TPC09 {

	public static void main(String[] args) {
		// static이 아닌 메서드 호출(객체 생성)
		int a = 56;
		int b = 40;
		
		// a + b = ?
		//int v = sum(a, b); //sum method가 static이 아니라 호출할 수 없음.
		TPC09 tpc09 = new TPC09(); //non-static이라 객체를 생성해서 호출. heapArea에 add공간 생성 
		int v = tpc09.sum(a, b);
		System.out.println(v);
	}
	
	public int sum(int a, int b) {
		int v = a + b;
		return v; 
	}

}
