package app;

public class WhileEx {
	public static void main (String[] args) {
		
//		int i = 1; 
//		while ( i <= 10) {
//			i ++;
//			System.out.println(i);
//		}
//		
		
		//1부터 10범위 홀수의 합을 출력 
		int k=1, sum = 0; 
		while ( k <= 10) {

			if ( k%2 ==1 ) {
				System.out.println(k);
				sum +=k;
			}
			k++;			
		}

		System.out.println(sum);
	}
}
