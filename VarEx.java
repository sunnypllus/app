package app;

public class VarEx {
	public static void main ( String[] args ) {
		//변수와 상수 
		int su;  //변수의 선언
		su = 10; //값 저장 
		System.out.println("결과1 : " + su);
		
		su = 20; 
		System.out.println("결과2 : " + su);
		
		su = su +1; 
		System.out.println("결과3 : " + su); 
		
		//자바에서는 상수를 표현할때 final 키워드를 사용합니다. 
		final int SU2 = 50; 
		System.out.println("final SU2 = "+ SU2); 
		//SU2 = 100;  //상수는 변경 못함. 
	}

}
