package app;

public class ArrayEx6 {
	// 다차원 배열 (array) 행과 열
	/*
	 표현) 
	 - int[][] arr = new int[3][2]
	 - int[][] arr = {
	  					[10,20},
	  					[30,40},
	  					[50,60}
	  				}
	  					
	*/
	public static void main(String[] args) {

		int[][] arr = new int[3][2];
		
		arr[0][0] = 1; 
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;
//
//		System.out.println("arr[0][0] : "+arr[0][0] );   
//		System.out.println("arr[0][1] : "+arr[0][1] );  
//		System.out.println("arr[1][0] : "+arr[1][0] );
//		System.out.println("arr[1][1] : "+arr[1][1] );
//		System.out.println("arr[2][0] : "+arr[2][0] );
//		System.out.println("arr[2][1] : "+arr[2][1] );
//

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				System.out.println("arr["+i+"]["+k+"]"+ arr[i][k]);
			}
		}
//		
		for (int[] ar_arr : arr) {
			for (int result : ar_arr) {
				System.out.println("=result="+ result);
			}
		}
		 

		int[][] arr2 = {
						{11, 22},
						{33, 44, 55},
						{66, 77}
						};

		
		for (int i = 0; i < arr2.length; i++) {

			for (int k = 0; k < arr2[i].length; k++) {
				System.out.println("=arr2["+i+"]["+k+"]"+ arr2[i][k]);
			}
			
		}

	
	
	}

}
