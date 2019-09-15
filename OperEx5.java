package app;

public class OperEx5 {
/*
 연산 후 대입 연산자
 형식)
	+=
	-=
	*=
	/=
	%=
 */
	public static void main (String[] args) {
		int a = 0;
		int b = 0;
		int sum= 0;
		a=10;
		b=20;
		sum = a+b;
		System.out.println("결과1 = " + sum);
		sum += a;  //sum = sum +a; 
		System.out.println("결과2 = " + sum);
	}
}
	
