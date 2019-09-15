package app;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		System.out.println(args[0] +1 + "----" + args[1] );
		
		
		//args = A B C 
		for(String str : args) {
			System.out.println(str); 
		}
		
		int [] su = new int[3]; 
		su[0] = 10; 
		su[1] = 20;
		su[2] = 30;
		
		for ( int su2 : su) {
			System.out.println(su2); 
		}

		for ( int i=0; i<su.length; i++) {
			System.out.println(su[i]); 
		}
		
		//º¸±â 1,5,3,8,2 => 8,5,3,2,1,
		int max = 0; 
		int temp = 0; 
	
		int[] descArr = {1,5,3,8,2}; 
		
//
		for (int i=0; i<descArr.length; i++) {
			System.out.println("i="+i + "^descArr["+i+"]"+descArr[i] +"^max="+ max );
			if (max < descArr[i]) {
				max = descArr[i];
			}
		}
		System.out.println("max ="+max);
		
		for (int i=0; i<descArr.length; i++) {
			for (int ii=i+1; ii<descArr.length; ii++) {
				System.out.println("i="+i + "^ii=" + ii + "^descArr["+i+"]"+descArr[i] + "^desc["+ii+"]"+descArr[ii]);
				if (descArr[i]< descArr[ii]) {
					//
					temp = descArr[i]; 
					descArr[i] = descArr[ii]; 
					descArr[ii] = temp; 
					//
				}
			}
		}
 
		
		for (int i=0; i<descArr.length; i++) {
			System.out.println(descArr[i]);
		}
		
		Arrays.parallelSort(descArr);
		
		for  ( int sort : descArr ) 
			System.out.println(sort); 
		
		java.util.List<int[]> list = Arrays.asList(descArr); 
		Collections.reverse(list);
		
	}

}
