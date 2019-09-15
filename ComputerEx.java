package app;

public class ComputerEx {

	public static void main(String[] args) {
		Computer myCom = new Computer(); 
		int[] values1 = {1, 2, 3}; 
		int result1 = myCom.sum1(values1); 
		System.out.println("result1:"+ result1); 
		
		//1. class Computer를 만들고 sum메소드를 구현하시요.
		//배열 인자 실행 방법 
		int result2 = myCom.sum1(new int[] {1,2,3,4,5} ); 
		System.out.println("result2: "+result2);
		
		//2. 인자를 사용한 sum2 메소드를 구현하시오.
		int result3 = myCom.sum2(1,2,3); 
		System.out.println("result3: "+result3);
		
		int result4 = myCom.sum2(1,2,3,4,5); 
		System.out.println("result4: "+result4);
		
	}

}
