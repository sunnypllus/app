package app;

public class CarEx {

	public static void main(String[] args) {
//		 new Car(); //Car class
//		 
//		 Car a = new Car();
//		 Car b = new Car();
//		 System.out.println( a==b); // false : heap 영역에 a랑 b와 다르게 생성된다. 
//		 System.out.println( a.equals(b)); // false : 모든객체는 object클래스를 강제 상속받으므로 equals를 사용할수 있다 
		
		//객체 생성 
		Car myCar = new Car(); 
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company); 
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
//		System.out.println("up속도: " + myCar.speedUp);
//		System.out.println("down속도: " + myCar.speedDown);
		
		//필드값 변경 
		myCar.speed = 60; 
		System.out.println("수정된 속도 :"+ myCar.speed);
		
		//메소드 호출 
		myCar.speedUp(20);  
		System.out.println("속도up :"+ myCar.speed);
		
		myCar.speedDown(10); 
		System.out.println("속도down :"+ myCar.speed);

		
		System.out.println("=========================");
		
		Car myNewCar = new Car("쏘울"); 
		System.out.print("제작회사: " + myNewCar.company); 
		System.out.print("\t모델명: " + myNewCar.model);
		System.out.print("\t색깔: " + myNewCar.color);
		System.out.print("\t최고속도: " + myNewCar.maxSpeed);
		System.out.print("\t현재속도: " + myNewCar.speed);
		

		System.out.println("\n=========================");
		
		Car myNewCar2 = new Car("K3","빨강"); 
		System.out.print("제작회사: " + myNewCar2.company); 
		System.out.print("\t모델명: " + myNewCar2.model);
		System.out.print("\t색깔: " + myNewCar2.color);
		System.out.print("\t최고속도: " + myNewCar2.maxSpeed);
		System.out.print("\t현재속도: " + myNewCar2.speed);


		System.out.println("\n=========================");
		
		Car myNewCar3 = new Car("BMW","하얀",200); 
		System.out.print("제작회사: " + myNewCar3.company); 
		System.out.print("\t모델명: " + myNewCar3.model);
		System.out.print("\t색깔: " + myNewCar3.color);
		System.out.print("\t최고속도: " + myNewCar3.maxSpeed);
		System.out.print("\t현재속도: " + myNewCar3.speed);

	
	}

}
