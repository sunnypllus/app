package app;

public class MethodEx {
	/*
	 -[����������] [������.��Ÿ������][��ȯ��] �޼ҵ�� (�Ű�������){
	 	���� ����(����);
	 	}
	 -���������� (Access Modifiers) 
	 	private, default(friendly), protected, public
	 - ������ : static, final, abstract, native ..
	 - ��ȯ��(return type) :
	     : �ڹ� ������ �ڷ���(�⺻��, ������)
	     : void ��ȯ���� ���� �޼ҵ� ���ǽ� ���.
	 - �޼ҵ�� : �ĺ��ڷ� ������ �̸� ����.
	 - ����(Arguments) : �Ű� ������� �ϸ� �޼ҵ� ȣ��� �����͸� �����ϱ� ���� �뵵�� �����. 
	 
	 ǥ��1) 
	    public int intA(){
	   	    ����;
	   	    return n; //n-> int �⺻ �ڷ����� �´� ������ ��Ȳ 
	    }
	 ǥ��2)
	    public void intB( int a,....){
	        ����;
	        //return ������ ������� ����.
	   }      
	*/
		
	public static void methodA() {
		System.out.println("methodA ����");
		 
	}

	public static void methodC(int su) {
		System.out.println("methodC ���� su=" + su);
		 
	}
	
	public static void main(String[] args) {
		System.out.println("����1");
		methodA(); 
		System.out.println("����2");
		
		int result = methodB(); 
		System.out.println("����3 :" + result);
		methodC(result);  
		System.out.println("����4 ");
    	System.out.println("����5 "+ methodD("A"));
	}
	
	public static int methodB() { 
		System.out.println("methodB ����");
		return 10; 
	}
	

	public static String methodD(String str) {
		String temp = "methodD ����"+ str; 
		
		System.out.println("methodD ����"+ str);
		return temp; 
	}
	
}
