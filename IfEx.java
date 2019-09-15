package app;

public class IfEx {
	/* 제어문 (조건문)
	if, else 의 조건식에 따라 프로그램의 흐름을 변경한다.
	표현)
		if( 조건식 ) {
			실행구문;
		}
		
		if( 조건식 ) {
			실행구분1;
		}else {
			실행구분2;
		}
	 */
	public static void main ( String[] args) {
		int num = 10; 
		//ex1
		if ( num > 10) {
			System.out.println("참 입니다");
		}
		System.out.println("실행 구문");
		
		//ex2
		if ( num > 10) {
			System.out.println("참 입니다");
		}else {
			System.out.println("거짓 입니다");
		}
		
	}

}
