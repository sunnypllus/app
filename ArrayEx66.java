package app;

public class ArrayEx66 {
//	���빮��) �迭���� ���հ� ����� ���Ͻÿ�.
//	����)    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr2 = {{60, 29},{37, 88, 57},{29, 88, 57, 70} };
		int sum = 0, count = 0; 
		double avg = 0.0; 
		
		for (int i = 0; i < arr2.length; i++) {
			for (int k = 0; k < arr2[i].length; k++) {
				System.out.println(arr2[i][k]); 
				sum += arr2[i][k];
				count++; 
			}
		}
		avg = (double) sum / count; 
		System.out.println("����="+sum);
		System.out.println("���="+avg);
		
		
		String[] aa = new String[5]; 
		System.out.println("aa="+aa[0]+'^');
	}

}
