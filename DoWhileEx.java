package app;

public class DoWhileEx {
	//�ݺ��� (do~ while��) 
	/* ǥ��
	 	do{
	 		���౸��; 
	 	} while (���ǽ�); 
	 	
	 */
	public static void main (String[] args) {
		
		int count = 0; 
		boolean sw = false; 
		do {
				count++; 
				sw = count < 0; 
				System.out.println("���౸��"+ count + ","+ sw); 
		} while (sw);
		 
	}
}
