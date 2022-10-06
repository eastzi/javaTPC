package javaTPC;

import kr.inflearn.IntArray;

public class TPC36 {

	public static void main(String[] args) {
		// 배열처럼 동작하는 클레스 API
		// 정수 3개를 배열에 저장하고 출력하라
		int[] a = new int[3]; 
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		int v = a[1]; 
		
		int len = a.length; 
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//API 이용
		IntArray arr = new IntArray(5); 
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
