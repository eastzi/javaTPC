package javaTPC;

public class TPC06 {

	public static void main(String[] args) {
		//5. 메서드 - 동작(method), 기능(function) 
		int a = 67;
		int b = 98; 
		//a + b = ? 
		int result = sum(a, b);
		System.out.println(result);
		
		int[] arr = makeArr(); //10, 20, 30 의 데이터가 넘어옴. / 3. 메서드 이름을 리턴받아 사용
		int hap = 0; 
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i]; 
		}
		System.out.println(hap);
	}
	
	// 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드 정의
	public static int sum(int a, int b) {
		int v = a + b;
		return v; //메서드는 위의 더하기 동작을 한 후 한개의 형태를 만들어낸다.
	}

	//데이터 10, 20, 30 을 전달하고자 함. -> 배열을 이용 
	public static int[] makeArr() { //2. 만들어낸 한개의 형태를 메서드에 담아서(변수처럼) 저장. 따라서 데이터 타입도 따라와야함. 
		int x = 10;
		int y = 20; 
		int z = 30;
		
		int[] arr = new int[3]; 
		arr[0] = x; 
		arr[1] = y;
		arr[2] = z;
		
		return arr; //1. 메서드는 위의 더하기 동작을 한 후 한개의 형태를 만들어낸다.
	}
	

}
