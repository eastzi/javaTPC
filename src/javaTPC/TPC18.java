package javaTPC;

import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {

	public static void main(String[] args) {
		//class 종류
		
		//1. java에서 제공해주는 class들 - API
		//문자열(String) 
		String str = new String("APPLE"); 
		System.out.println(str.toLowerCase()); //대문자를 소문자로 바꿔 출력해주는 메서드
		
		//2. 직접 만들어서 사용하는 class들 - DTO/VO, DAO, Utility 등 API
		MyUtil my = new  MyUtil(); 
		int sum = my.hap(); 
		System.out.println(sum);
		
		//3. 다른 회사에서 만든 class들(API) 사용
		//Gson -> json 생성시 사용 -> MVN 사용 
		Gson g = new Gson(); 
		BookVO vo = new BookVO("자바", 13000, "영진", 800); 
		String json = g.toJson(vo); 
		System.out.println(json);
	}

}
