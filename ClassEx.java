package app;

/*
 * 클래스(class)
 - 객체를 정의해 놓은 것 -> 객체를 생성 하기 위한 템플릿(templete) 
 - 객체의 구성 및 생성에 쓰임.
 
 * 객체(object)
 - 속성(특성)과 기능으로 구성.
 - 실생활에 존재하는 것들을 모두 표현함.
 
 * 객체지향이란 : 사물이나 개념을 "속성과 기능을 가진 객체"로 모델링하고, 이들간의 관계를 정의 함.(Self-contained Component 스스로 존재하는 자) 
 
 * 자바에서의 객체지향 3단계 
   1) 객체 모델링 - 프로그래밍 하고자 하는 객체의 속성과 필요한 기능을 정리한다.
   2) 클래스 정의 - 객체를 실제로 사용하기 위해서, 클래스라는 형태로 객체를 표현한다. 
   3) 객체 생성과 사용 - 정의된 클래스를 이용해서, 메모리상에 객체(object)를 생성하고 사용한다. 
 
 * 생성자 (constructor) 
 - 객체 지향 프로그래밍 (OOP : Objective-oriented programming) 에서 쓰이는 객체 초기화 함수. 
 - 객체의 생성시에만 호출되어 메모리 생성과 동시에 객체의 데이터를 초기화하는 역할을 함. 
 - 특징
  	1) 생성자의 이름은 클래스의 이름과 동일하게 사용.
  	2) 오버로딩(overloading) 가능함.
  	3) 반환형을 사용하지 않음.
  	4) 기본 생성자의 개념이 존재함. 
  	5) 멤버 변수 초기화 역할을 가짐.

 표현) 
 - 클래스 : 
 [접근제어자] CLASS 클래스명 {
 	변수, 생성자, 메소드를 정의 함. 
 }
 ex) public CalasName { 
 } 
 
 - 객체 :
 [참조형] 참조변수명 = new [클래스명](); 
 ex) 
 	A a = new A(); 
 
 */

public class ClassEx {
	int a =0; 
	//기본생성자  생략 가능 
	public ClassEx() {
		a = 10; 
		System.out.println("Constructor 실행"); 
	}
	public void method() {
		System.out.println("method 실행"); 
	}
	public static void main(String[] args) {
		ClassEx obj = new ClassEx();
		int a = obj.a; 
		System.out.println( "a="+a);
		obj.method(); 

	}

}
