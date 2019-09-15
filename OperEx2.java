package app;

public class OperEx2 {
	/*
	 * 비교연산자
	 	<
	 	>
	 	<=
	 	>=
	 	==
	 	!=
	 	!
	 	instanceof 
	 */
	public static void main (String[] args) {
		int x = 30; 
		int y = 20;
		boolean result = x < y ;
		System.out.println("결과1 : "+ result); 
		result = x > y ;
		System.out.println("결과2 : "+ result); 
		result = x >= y ;
		System.out.println("결과3 : "+ result); 
		result = x <= (y + 10) ;
		System.out.println("결과4 : "+ result); 
		result = (x - 10) == y ;
		System.out.println("결과5 : "+ result); 
		result = x != y ;
		System.out.println("결과6 : "+ result); 
		result = ! result ;
		System.out.println("결과7 : "+ result);
		
	}
}
