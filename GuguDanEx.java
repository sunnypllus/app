package app;

public class GuguDanEx {

	public static void main(String[] args) {
		
		
//		int k =0;  
////		����1) ������ 7���� ����Ͻÿ�
//		k = 7;
//		for (int kk = 1; kk<=9; kk++) {
//			 System.out.println(k + "x" + kk + "=" + k*kk );
//		 }
//
////		����2) ������ ���� �Է��Ͽ� ����Ͻÿ�		
//		java.util.Scanner scan = new java.util.Scanner(System.in); 
//		k = scan.nextInt();
//
//			 for (int kk = 1; kk<=9; kk++) {
//				 System.out.println(k + "x" + kk + "=" + k*kk );
//			 }
//
////		����3) ������ 9�ܱ��� ����Ͻÿ�
//		for (int k = 2; k<=9; k++) {
//			 for (int kk = 1; kk<=9; kk++) {
//				 System.out.println(k + "x" + kk + "=" + k*kk );
//			 }
//			 System.out.println("------");
//		}
//		

//		����4) �����ﰢ��
		for (int k = 1; k<=5; k++) {
			for (int kk=1; kk<=k; kk++) {
			 System.out.print("*");
			}
			 System.out.print("\n");
		}

//		����5) �������ﰢ��
		for (int k = 5; k>=1; k--) {
			for (int kk=1; kk<=k; kk++) {
			 System.out.print("*");
			}
			 System.out.print("\n");
		}
		
		int max=0; 
//		����44) �������ﰢ��2
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
//		����55) �����ﰢ��2
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
