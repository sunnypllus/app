package app;

public class ArrayEx2 {

	public static void main(String[] args) {

		int[] arr2 = new int[50];
		int[] arr3 = new int[50];

		int idx2 = 0; 
		int idx3 = 0;
		
		for (int i=0; i<arr2.length + arr3.length; i++) {
			if ( i%2 == 0 ) {
				arr2[idx2++] = i+1;
			}else {
				arr3[idx3++] = i+1;
			}
		}
			
		System.out.println("-------------------");
		for (int i=0; i<arr2.length; i++) {
				System.out.println(i + "arr2["+i+"]"+ arr2[i]);
		}
		
		System.out.println("-------------------");
		for (int i=0; i<arr3.length; i++) {
			System.out.println(i + "arr3["+i+"]"+ arr3[i]);
		}

	}
}
