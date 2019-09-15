package app;

public class ForContinueEx {

	public static void main(String[] args) {
		 for (int i=0; i<10; i++) {
			 System.out.println("반복 실행문" + i); 
			 if (i >3 ) {
				 continue; 
			 }
			 System.out.println("반복 실행 제한"); 
		 }

	}

}
