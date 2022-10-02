package javaTPC;

public class TPC07 {

	public static void main(String[] args) {
		//메서드 매개변수 전달기법
		
		int a = 20; 
		float b = 56.7f;
		
		//a + b =?
		//Call By Value - 값 전달
		float v = sum(a, b); 
		System.out.println(v);
		
		//배열의 총합?
		//Call By Reference - 번지 전달
		int[] arr = {1, 2, 3, 4, 5};
		int vv = arrSum(arr);
		System.out.println(vv);
	}
	
	private static int arrSum(int[] x) {
		int hap = 0; 
		for(int i = 0; i < x.length; i++) {
			hap += x[i]; 
		}
		return hap;
	}

	public static float sum(int a, float b) {
		float v = a + b;
		return v; 
	}

}
