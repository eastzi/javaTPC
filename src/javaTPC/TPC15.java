package javaTPC;

import kr.tpc.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		
		//setter 메서드 사용하지 않는 방법
		MemberVO m = new MemberVO("홍", 23, "010-222-222", "서울");
		
		//getter 메서드의 묶음(?) = toString()
		System.out.println(m.toString());
		
		//setter, getter 이용한 방법
		MemberVO m1 = new MemberVO();
		
		m1.setName("김");
		m1.setAge(34);
		m1.setTel("010-111-111");
		m1.setAddr("서울");
		
		System.out.println(m1.getName());
		System.out.println(m1.getAge());
		System.out.println(m1.getTel());
		System.out.println(m1.getAddr());
		System.out.println(m1); //toString 생략 가능
	}

}
