package kr.tpc;

public class JAVAMySQL implements DBConnect {

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("MySQL DB가 접속됩니다.");
	}

}
