package app;

public class ConstructorEx {

	public ConstructorEx() {
		System.out.println("����1"); 
	}
	//�����ε� 
	public ConstructorEx(int a) {
		System.out.println("����2_"+ a);
	}
	
	public ConstructorEx(String a) {
		System.out.println("����3_"+a);
	}
	public ConstructorEx(String a, int b) {
		System.out.println("����4_"+a + b);
	}
	public ConstructorEx(int a, String b) {
		System.out.println("����5_"+ a + b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorEx();
		new ConstructorEx(10);
		new ConstructorEx("����");
		new ConstructorEx("�ٶ�",20);
		new ConstructorEx(30,"����");
	}

}
