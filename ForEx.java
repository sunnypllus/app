package app;

public class ForEx {
	/* 반복문 (for문) 
	표현)
	for (변수선언(초기화) ; 조건식; 증가 혹은 감소 수식){
		실행구문;
	}
	 */
	
	public static void main(String[] args) {
		
//		for ( int i=0; i<10; i++) {
//			System.out.println("실행구문"+i); 
//		}
//		
//		int sum =0; 
//		
//		for ( int i=1; i<=10; i++) {
//			//sum = sum + i; 
//			sum += i;
//			System.out.println(sum); 
//		}
		//1부터 10범위 짝수를 출력하시요.
		for ( int i=1; i<=10; i++) {

			if (i%2 == 0) {		
				System.out.println("짝수:"+i);
			}
		}		

	}

}
