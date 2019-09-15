package app;

public class ConstructorEx {

	public ConstructorEx() {
		System.out.println("실행1"); 
	}
	//오버로드 
	public ConstructorEx(int a) {
		System.out.println("실행2_"+ a);
	}
	
	public ConstructorEx(String a) {
		System.out.println("실행3_"+a);
	}
	public ConstructorEx(String a, int b) {
		System.out.println("실행4_"+a + b);
	}
	public ConstructorEx(int a, String b) {
		System.out.println("실행5_"+ a + b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorEx();
		new ConstructorEx(10);
		new ConstructorEx("가나");
		new ConstructorEx("다라",20);
		new ConstructorEx(30,"마바");
	}

}
