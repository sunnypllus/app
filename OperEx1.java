package app;

public class OperEx1 {

	/*
	데이터 연산자
	수학적(산술) 연산자
	표현)
		+ 더하기
		- 빼기
	 	* 곱하기
		/ 나누기
		% 나머지
	 */
	public static void main ( String[] args) {
		int a = 10; 
		int b = 20; 
		int result = 0; 
		
		result = a + b;
		System.out.println("결과1 :" + result); 
		result = a - b;
		System.out.println("결과2 :" + result); 
		result = a * b;
		System.out.println("결과3 :" + result); 
		result = a / b;
		System.out.println("결과4 :" + result); 
		result = a % b;
		System.out.println("결과5 :" + result);
	}
}
