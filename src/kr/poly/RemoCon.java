package kr.poly;

public interface RemoCon { //객체생성 불가 
	//상수 사용가능
	public static final int MAXCH = 100; 
	public final static int MINCH = 1; 
	
	//추상메서드
	public void chUp(); 
	public void chDown(); 
	public void internet(); 
	//구현된 메서드를 가질 수 없다. 
}
