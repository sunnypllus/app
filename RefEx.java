package app;

public class RefEx {
	public static void main (String[] args) {
		
		//�⺻Ÿ��
		int age = 25; 
		double price = 100.5;
		
		//����Ÿ��	: String��ü�� �⺻Ÿ��ó�� ��� �Ҽ� �ִ� Ư¡�� �ִ�. 
		String name = "ȫ�浿";
		String hobby = "�ڵ�";
				
		//�ڵ� ����1 : ����Ÿ���� new�� ǥ���Ѵ�. 
		//String name = new String("ȫ�浿");	 
		//String hobby = new String("�ڵ�");

		//�ڵ� ����2 
		//new RefEx();  //���� ���� class 
		
		//�ڵ� ����3
		//age = new int;  //�⺻Ÿ���� new�� �ȵ�  

		//�ڵ� ����4
		//name = new String(); // ��üŸ���� new�� ��. 
		 
		
		System.out.println(age); 
		System.out.println(price);
		System.out.println(name);
		System.out.println(hobby);

		System.out.println("====================");
		
		String refVar1 = "������1"; 
		String refVar2 = "������2";
		String refVar3 = "������2";
		
		System.out.println(refVar1 == refVar2); //F
		System.out.println(refVar1 != refVar2); //T
		
		System.out.println(refVar2 == refVar3); //T
		System.out.println(refVar2 != refVar3); //F
		
		//age == age;
		
		System.out.println(age = age); //
		
		refVar2 = null; 
		System.out.println(refVar2); 
		refVar3 = null;
		System.out.println(refVar3); 
		
		 
		refVar3 = "������3";
		System.out.println(refVar3.length()); 
		
		//��ü ������ �Ǿ� ���� ���� ���¿��� ����Ϸ��� �ϸ�  java.lang.NullPointerException ����. 
		//refVar3 = null;
		//System.out.println(refVar3.length() ); 

		// String ����
		String refVar4 = "������"; 
		String refVar5 = "������";
		
		if (refVar4 == refVar5) {
			System.out.println("������ ����"); 
		}else {
			System.out.println("������ �ٸ���");
		}

		if (refVar4.equals( refVar5) ) {
			System.out.println("���ڿ��� ����"); 
		}else {
			System.out.println("���ڿ��� �ٸ���");
		}
		

		// String ����
		String refVar6 = new String("������"); 
		String refVar7 = new String("������");
		
		if (refVar6 == refVar7) {
			System.out.println("������ ����"); 
		}else {
			System.out.println("������ �ٸ���");
		}

		if (refVar6.equals( refVar7) ) {
			System.out.println("���ڿ��� ����"); 
		}else {
			System.out.println("���ڿ��� �ٸ���");
		}
		
		 
		 
	}
}
