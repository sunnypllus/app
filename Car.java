package app;

public class Car {
	//필드
	String company ="현대자동차"; 
	String model ="그랜저"; 
	String color = "검정"; 
	int maxSpeed = 350; 
	int speed; 
	
	//생성자
	public Car() {
		speed = 100; 
	}
	
	public Car(String model) {
		this(model,null,0); 
	}
	
	public Car(String model, String color) {
		this(model,color,0); 
	}
	
	public Car(String model,String color,int maxSpeed) {
		this.model = model;
		this.color = color; 
		this.maxSpeed = maxSpeed;
		
	} 
	
	//메소드 
	public void speedUp(int sp) {
		speed += sp; 
	}
	
	public void speedDown(int sp) {
		speed +=sp; 
	}	
}





/* 
 * 하나의 java파일에 여러개의 class를 만들수 있다. 
 */
class Car2{
	
}