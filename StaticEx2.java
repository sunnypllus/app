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
	StaticEx2 rec =	new StaticEx2();  //���� heap �޸� ����ϴ� ������� ����ؾ� �Ѵ�. 
	
	}

}
