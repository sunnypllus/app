package app;

public class Calculator {
	int msg; 
	
	int plus(int x, int y) {
		int result = x+ y; 
		return result; 
	}
	
	double avg(int x, int y) {
		double sum = (double) plus(x,y); 
		double result = (double) sum /2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10); 
		println("실행결과:"+ result); 
	}
	
	void println ( String message) {
		System.out.println(this.msg); 
	}

	void println ( int message) {
		this.msg = message; 
		System.out.println(this.msg); 
	}
	
//class CalculatorEx를 만들고 객체를 생성 후 실행 하시오
//plus method 호출하여 결과를 출력하시오.
	
//	public static void main(String[] args) {
//		Calculator cal = new Calculator();
//		
//		cal.execute();
//		cal.plus(10, 5);
//		cal.println(cal.plus(10, 5));
// 
//	}
}
