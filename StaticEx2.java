package app;

public class StaticEx2 {

	static String company = "Samsung";
	static String model = "LCD"; 
	static String info;
	int var; 
	static {
			info = company + "-" + model;
			System.out.println(info ); 
//			var = 10;
	}
//	
//	static void method() {
//		var = 10; 
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StaticEx2 rec =	new StaticEx2();  //동적 heap 메모리 사용하는 방법으로 사용해야 한다. 
	
	}

}
