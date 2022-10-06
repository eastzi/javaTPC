package javaTPC;

import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDto;

public class TPC38 {

	public static void main(String[] args) {
		// ArrayList
		//List list = new ArrayList(); -> Object[] => 기본구성
		List<BookDto> list = new ArrayList<BookDto>(); // Object[] -> BookDto[]로 변경 => 안정성이 증가
		list.add(new BookDto("자바", 12000, "이지스", 600));
		list.add(new BookDto("c언어", 13000, "에이콘", 700));
		list.add(new BookDto("Python", 14000, "제이팝", 800));
		
		for(int i = 0; i < list.size(); i++) {
			//Object o = list.get(i);
			BookDto vo = list.get(i); // Object[] -> BookDto[]로 변경 => 안정성이 증가
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}

	}

}
