package javaTPC;

public class TPC08 {
	public static void main(String[] args) {
		
		//jvm 메모리 작동 방식 
		/*
		 * 1. 프로그램 실행
		 * 2. 해당 클래스를 찾음
		 * 3. 클래스 내부의 static 메소드를 method area - static zone에 메모리 로딩
		 * 4. main과 add가 순차적으로 로딩됨. 
		 * 5. static zone에서 main 메서드가 실행되고 add 메서드를 호출하면
		 * 6. static area로 들어감. 
		 * 7. LIFO 로 프로그램이 실행되면 메서드가 종료되면서 사라짐.
		 * 8. 프로그램이 완전 종료되면 static area는 빈(empty) 상태가 됨. 
		 */
		int a = 30; 
		int b = 50; 
		int v = add(a, b); //static method call
		
		System.out.println(v);
	}
	
	public static int add(int a, int b ) {
		int sum = a + b; 
		return sum; 
	}
	
	
}
