package app;

public class OperEx2 {
	/*
	 * �񱳿�����
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
		System.out.println("���1 : "+ result); 
		result = x > y ;
		System.out.println("���2 : "+ result); 
		result = x >= y ;
		System.out.println("���3 : "+ result); 
		result = x <= (y + 10) ;
		System.out.println("���4 : "+ result); 
		result = (x - 10) == y ;
		System.out.println("���5 : "+ result); 
		result = x != y ;
		System.out.println("���6 : "+ result); 
		result = ! result ;
		System.out.println("���7 : "+ result);
		
	}
}
