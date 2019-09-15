package app;

public class GuguDanEx {

	public static void main(String[] args) {
		
		
//		int k =0;  
////		응용1) 구구단 7단을 출력하시오
//		k = 7;
//		for (int kk = 1; kk<=9; kk++) {
//			 System.out.println(k + "x" + kk + "=" + k*kk );
//		 }
//
////		응용2) 구구단 단을 입력하여 출력하시오		
//		java.util.Scanner scan = new java.util.Scanner(System.in); 
//		k = scan.nextInt();
//
//			 for (int kk = 1; kk<=9; kk++) {
//				 System.out.println(k + "x" + kk + "=" + k*kk );
//			 }
//
////		응용3) 구구단 9단까지 출력하시오
//		for (int k = 2; k<=9; k++) {
//			 for (int kk = 1; kk<=9; kk++) {
//				 System.out.println(k + "x" + kk + "=" + k*kk );
//			 }
//			 System.out.println("------");
//		}
//		

//		응용4) 직각삼각형
		for (int k = 1; k<=5; k++) {
			for (int kk=1; kk<=k; kk++) {
			 System.out.print("*");
			}
			 System.out.print("\n");
		}

//		응용5) 역직각삼각형
		for (int k = 5; k>=1; k--) {
			for (int kk=1; kk<=k; kk++) {
			 System.out.print("*");
			}
			 System.out.print("\n");
		}
		
		int max=0; 
//		응용44) 역직각삼각형2
		max = 5;
		for (int k = 1; k<=5; k++) {
			for (int kk=1; kk<=max; kk++) {
			    if (kk >= k ) {
			    	System.out.print("*");
			    }else {
			    	System.out.print(" ");
			    }
			}
				System.out.print("\n");
		}
//		응용55) 직각삼각형2
		max = 5;
		for (int k = 5; k>=1; k--) {
			for (int kk=1; kk<=max; kk++) {
				if (kk >= k ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
				System.out.print("\n");
		}
		
	}
}
