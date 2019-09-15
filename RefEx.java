package app;

public class RefEx {
	public static void main (String[] args) {
		
		//기본타입
		int age = 25; 
		double price = 100.5;
		
		//참조타입	: String객체는 기본타입처럼 사용 할수 있는 특징이 있다. 
		String name = "홍길동";
		String hobby = "코딩";
				
		//코딩 예시1 : 참조타입은 new로 표현한다. 
		//String name = new String("홍길동");	 
		//String hobby = new String("코딩");

		//코딩 예시2 
		//new RefEx();  //내가 만들 class 
		
		//코딩 예시3
		//age = new int;  //기본타입은 new가 안됨  

		//코딩 예시4
		//name = new String(); // 객체타입은 new가 됨. 
		 
		
		System.out.println(age); 
		System.out.println(price);
		System.out.println(name);
		System.out.println(hobby);

		System.out.println("====================");
		
		String refVar1 = "데이터1"; 
		String refVar2 = "데이터2";
		String refVar3 = "데이터2";
		
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
		
		 
		refVar3 = "데이터3";
		System.out.println(refVar3.length()); 
		
		//객체 참조가 되어 있지 않은 상태에서 사용하려고 하면  java.lang.NullPointerException 오류. 
		//refVar3 = null;
		//System.out.println(refVar3.length() ); 

		// String 예제
		String refVar4 = "데이터"; 
		String refVar5 = "데이터";
		
		if (refVar4 == refVar5) {
			System.out.println("참조가 같음"); 
		}else {
			System.out.println("참조가 다르다");
		}

		if (refVar4.equals( refVar5) ) {
			System.out.println("문자열이 같음"); 
		}else {
			System.out.println("문자열이 다르다");
		}
		

		// String 예제
		String refVar6 = new String("데이터"); 
		String refVar7 = new String("데이터");
		
		if (refVar6 == refVar7) {
			System.out.println("참조가 같음"); 
		}else {
			System.out.println("참조가 다르다");
		}

		if (refVar6.equals( refVar7) ) {
			System.out.println("문자열이 같음"); 
		}else {
			System.out.println("문자열이 다르다");
		}
		
		 
		 
	}
}
