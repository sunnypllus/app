package app;

public class Car {
	//�ʵ�
	String company ="�����ڵ���"; 
	String model ="�׷���"; 
	String color = "����"; 
	int maxSpeed = 350; 
	int speed; 
	
	//������
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
	
	//�޼ҵ� 
	public void speedUp(int sp) {
		speed += sp; 
	}
	
	public void speedDown(int sp) {
		speed +=sp; 
	}	
}





/* 
 * �ϳ��� java���Ͽ� �������� class�� ����� �ִ�. 
 */
class Car2{
	
}