package javaTPC;

public class TPC04 {
	public static void main(String[] args) {
		//4. 데이터 이동(변수 VS 배열)
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		
		// a + b + c = ? -> 메소드 처리(해당 변수 데이터 이동) 
		hap(a,b,c);
		
		int[] arr = new int[3]; 
		arr[0] = a; 
		arr[1] = b;
		arr[2] = c;
		
		//arr 배열을 hap1 메소드로 넘기기 
		hap1(arr); 
		
	}
	
	
	//메소드 처리 
	public static void hap(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}
	
	//매개변수는 타입은 맞추고, 변수명은 달라도 됨.
	public static void hap1(int[] x) {
		//배열이니 반복문을 활용하여 로직처리
		//1. int sum = x[0] + x[1] + x[2];
		
		//2. 
		int sum = 0; 
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		
		System.out.println(sum);
	}
	
}
