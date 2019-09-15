package app;

/*
자료형(Data Type)
- 변수 또는 상수가 차지하는 메모리의 양(byte)과 종류를 의미한다.
- 자바의 자료형은 크게 기본 자료형과 참조형으로 나눌 수 있다.

1) 기본형
	- boolean (true, false) : 8bit 
	- byte : 8 bit
	- short : 16 bit
	- char : 16 bit
	- int : 32 bit
	- long : 64 bit
	- float : 32 bit
	- double : 64 bit
	
2) 참조형
	- 클래스 (clases )
	- 배열 ( array )
	- 인터페이스 ( interface )
	- 열거 (enum ) 
*/

public class DataTypeEx {
	public static void main (String[] args) {
		byte byte1 = 127;
		short short1 = 200; 
		char char1 ='한'; 
		char char2 ='1';   //씽글쿼테이션
		int int1 = 1000; 
		long long1 = 500000;
		float float1 = 0.5f;   //0.5F 가능
		double double1 = 1.5d; //1.5D 가능
		boolean boolean1 = false; 
		
		String str1 = "rkskek"; //더블쿼테이션
		
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
