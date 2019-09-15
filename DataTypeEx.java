package app;

/*
�ڷ���(Data Type)
- ���� �Ǵ� ����� �����ϴ� �޸��� ��(byte)�� ������ �ǹ��Ѵ�.
- �ڹ��� �ڷ����� ũ�� �⺻ �ڷ����� ���������� ���� �� �ִ�.

1) �⺻��
	- boolean (true, false) : 8bit 
	- byte : 8 bit
	- short : 16 bit
	- char : 16 bit
	- int : 32 bit
	- long : 64 bit
	- float : 32 bit
	- double : 64 bit
	
2) ������
	- Ŭ���� (clases )
	- �迭 ( array )
	- �������̽� ( interface )
	- ���� (enum ) 
*/

public class DataTypeEx {
	public static void main (String[] args) {
		byte byte1 = 127;
		short short1 = 200; 
		char char1 ='��'; 
		char char2 ='1';   //�ű������̼�
		int int1 = 1000; 
		long long1 = 500000;
		float float1 = 0.5f;   //0.5F ����
		double double1 = 1.5d; //1.5D ����
		boolean boolean1 = false; 
		
		String str1 = "rkskek"; //���������̼�
		
		System.out.println("bype : " + byte1);
		System.out.println("short1 : " + short1); 
		System.out.println("char1 : " + char1); 
		System.out.println("char2 : " + char2); 
		System.out.println("int1 : " + int1); 
		System.out.println("long1 : " + long1); 
		System.out.println("float1 : " + float1); 
		System.out.println("double1 : " + double1);  
		System.out.println("boolean1 : " + boolean1);  
		System.out.println("str1 : " + str1);  
	}
}
