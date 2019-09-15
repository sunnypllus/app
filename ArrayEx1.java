package app;

public class ArrayEx1 {
	public static void main (String[] arag) {
		
		int[] arr = new int[100];
		int sum = 0; 
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1; 
		}
		 
		for (int i=0; i<arr.length; i++) {
			sum += arr[i]; 

			//System.out.println(arr[i]);
		}
		System.out.println("гу="+ sum);

		
		
	}
}
