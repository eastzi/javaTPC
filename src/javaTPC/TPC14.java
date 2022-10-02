package javaTPC;

import kr.tpc.MemberVO;

public class TPC14 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO();
		
		/*public으로 직접 접근한 방법. 
		m.name = "홍"; 
		m.age = 23; 
		m.tel = "010-222-222"; 
		m.addr = "서울"; 
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.tel);
		System.out.println(m.addr);
		*/
		
		//private인 경우 접근방법 - getter, setter 메서드 이용
		m.setName("홍");
		m.setAge(23);
		m.setTel("010-222-222");
		m.setAddr("서울");
		
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getTel());
		System.out.println(m.getAddr());
		
		
	}

}
