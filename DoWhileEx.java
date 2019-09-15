package app;

public class DoWhileEx {
	//반복문 (do~ while문) 
	/* 표현
	 	do{
	 		실행구분; 
	 	} while (조건식); 
	 	
	 */
	public static void main (String[] args) {
		
		int count = 0; 
		boolean sw = false; 
		do {
				count++; 
				sw = count < 0; 
				System.out.println("실행구문"+ count + ","+ sw); 
		} while (sw);
		 
	}
}
