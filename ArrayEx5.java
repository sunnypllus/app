package app;
import java.util.Arrays;
import java.util.Collections;

public class ArrayEx5 {

	public static void main(String[] args) {
		boolean run = true; 
		int studentNum = 0; 
//		int[] scores  = null;
		Integer[] scores = null;  
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����"); 
			System.out.println("------------------------------------------------------");
			System.out.println("����>");
			
			int selectNo = scan.nextInt(); 
			
			if (selectNo == 1) {  //1.�л���
				System.out.println("�л����� �Է��ϼ���.>");
				studentNum = scan.nextInt() ;
				//scores = new int[studentNum]; 
				scores = new Integer[studentNum];
				
				for (int i=0; i<studentNum; i++) {
					//System.out.println("i="+i + "^studentNum=" + studentNum );
					scores[i] = 0; 
				}
			} else if (selectNo == 2) { //2.�����Է�
				System.out.println("������ �Է��ϼ���.>");
				for (int i=0; i<studentNum; i++) {
					scores[i] = scan.nextInt(); 
				} 
			} else if (selectNo == 3) {  //3.��������Ʈ
	
				Arrays.sort(scores, java.util.Collections.reverseOrder()); 
				
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores["+i +"]"+ scores[i] );
				} 
			
			} else if (selectNo == 4) {  //4.�м�
				int max = 0; 
				int sum = 0; 
				double avg = 0; 
				for (int i = 0; i<scores.length; i++) {
					max = (max < scores[i] ) ? scores[i] : max;
					sum += scores[i]; 
				}
				//
				avg = (double) sum / studentNum; 
				System.out.println("�ְ� ���� :" + max ); 
				System.out.println("��� :" + avg ); 
				
				
			} else if (selectNo == 5) {  //5.����
				run = false; 
			}
			
		}

	}
	
}
