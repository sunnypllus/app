package app;

public class ArrayEx66 {
//	응용문제) 배열값의 총합과 평균을 구하시오.
//	보기)    
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
		System.out.println("총합="+sum);
		System.out.println("평균="+avg);
		
		
		String[] aa = new String[5]; 
		System.out.println("aa="+aa[0]+'^');
	}

}
