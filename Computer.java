package app;

public class Computer {

	int sum1(int[] arrPlus) {
		int sum = 0; 
		for (int i = 0; i< arrPlus.length; i++) {
			sum += arrPlus[i]; 
		}
		return sum;

	}
	

	int sum2(int ar1, int ar2, int ar3 ) {
		int sum = 0; 
		sum = ar1+ ar2+ ar3;  
		return sum;

	}
	int sum2(int ... arrPlus) {
		int sum = 0; 
		for (int i = 0; i< arrPlus.length; i++) {
			sum += arrPlus[i]; 
		}
		return sum;
	}

}
