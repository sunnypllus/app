package app;

public class StaticEx {
	static double pi = 3.14159; 
	static int plus(int x, int y ) {
		return x + y; 
	}
	static int minus ( int x, int y) {
		return x-y; 
	}
	public static void main (String[] args) {
		double result1 = 10*10* StaticEx.pi;//StaticEx 생략 가능  
		int result2 = plus(10, 5);  		//StaticEx 생략 가능  
		int result3 = minus(10, 5);  		//StaticEx 생략 가능
		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2); 
		System.out.println("result3 :" + result3);  
				

		double res1 = 10*10* staticTest.pi2; // 다른 클래스 이므로 색략 하면 안됨  
		int res2 = staticTest.plus2(10, 5);  // 다른 클래스 이므로 색략 하면 안됨  
		int res3 = staticTest.minus2(10, 5); //  다른 클래스 이므로 색략 하면 안됨
		System.out.println("res1 :" + res1);
		System.out.println("res2 :" + res2); 
		System.out.println("res3 :" + res3);
	}
	

	
}

class staticTest{
	static double pi2 = 3.14159; 
	static int plus2(int x, int y ) {
		 return x+y; 
	}

	static int minus2 ( int x, int y) {
		return x-y; 
	}
}
