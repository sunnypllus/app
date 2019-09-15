package app;

public class MethodEx {
	/*
	 -[접근제어자] [수정자.기타제어자][반환형] 메소드명 (매개변수들){
	 	실행 구분(구현);
	 	}
	 -접근제어자 (Access Modifiers) 
	 	private, default(friendly), protected, public
	 - 수정자 : static, final, abstract, native ..
	 - 반환형(return type) :
	     : 자바 데이터 자료형(기본형, 참조형)
	     : void 반환형이 없는 메소드 정의시 사용.
	 - 메소드명 : 식별자로 임의의 이름 정의.
	 - 인자(Arguments) : 매개 변수라고 하며 메소드 호출시 데이터를 전달하기 위한 용도로 사용함. 
	 
	 표현1) 
	    public int intA(){
	   	    구현;
	   	    return n; //n-> int 기본 자료형에 맞는 데이터 반황 
	    }
	 표현2)
	    public void intB( int a,....){
	        구현;
	        //return 구문을 사용하지 않음.
	   }      
	*/
		
	public static void methodA() {
		System.out.println("methodA 실행");
		 
	}

	public static void methodC(int su) {
		System.out.println("methodC 실행 su=" + su);
		 
	}
	
	public static void main(String[] args) {
		System.out.println("실행1");
		methodA(); 
		System.out.println("실행2");
		
		int result = methodB(); 
		System.out.println("실행3 :" + result);
		methodC(result);  
		System.out.println("실행4 ");
    	System.out.println("실행5 "+ methodD("A"));
	}
	
	public static int methodB() { 
		System.out.println("methodB 실행");
		return 10; 
	}
	

	public static String methodD(String str) {
		String temp = "methodD 실행"+ str; 
		
		System.out.println("methodD 실행"+ str);
		return temp; 
	}
	
}
