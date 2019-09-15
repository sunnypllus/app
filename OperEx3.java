package app;

public class OperEx3 {
	/* 
	 삼항 연산자
	 형식)
	 	데이터형 변수 = 조건식 ? 값1 : 값2; 
	 * 
	 */
	public static void main ( String[] args ) {
		boolean result = true ? true : false ;
		System.out.println ("결과 : " + result); 
		
		
		int a = 10, b = 20; 
		String c = (a > b ) ? "참" : "거짓" ;
		System.out.println ("c : " + c);
	}
	
}