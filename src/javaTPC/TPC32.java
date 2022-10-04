package javaTPC;

import kr.tpc.DBConnect;
import kr.tpc.JAVAMySQL;
import kr.tpc.JAVAOracle;

public class TPC32 {

	public static void main(String[] args) {
		//인터페이스와 JDBC 관계
		
		//Oracle, MySQL => Driver Class
		DBConnect conn = new JAVAOracle(); 
		conn.getConnection("url", "bit", "12345");

		conn = new JAVAMySQL();
		conn.getConnection("url", "root", "ABCDEF");
	}

}
