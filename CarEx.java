package app;

public class CarEx {

	public static void main(String[] args) {
//		 new Car(); //Car class
//		 
//		 Car a = new Car();
//		 Car b = new Car();
//		 System.out.println( a==b); // false : heap ������ a�� b�� �ٸ��� �����ȴ�. 
//		 System.out.println( a.equals(b)); // false : ��簴ü�� objectŬ������ ���� ��ӹ����Ƿ� equals�� ����Ҽ� �ִ� 
		
		//��ü ���� 
		Car myCar = new Car(); 
		//�ʵ尪 �б�
		System.out.println("����ȸ��: " + myCar.company); 
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
//		System.out.println("up�ӵ�: " + myCar.speedUp);
//		System.out.println("down�ӵ�: " + myCar.speedDown);
		
		//�ʵ尪 ���� 
		myCar.speed = 60; 
		System.out.println("������ �ӵ� :"+ myCar.speed);
		
		//�޼ҵ� ȣ�� 
		myCar.speedUp(20);  
		System.out.println("�ӵ�up :"+ myCar.speed);
		
		myCar.speedDown(10); 
		System.out.println("�ӵ�down :"+ myCar.speed);

		
		System.out.println("=========================");
		
		Car myNewCar = new Car("���"); 
		System.out.print("����ȸ��: " + myNewCar.company); 
		System.out.print("\t�𵨸�: " + myNewCar.model);
		System.out.print("\t����: " + myNewCar.color);
		System.out.print("\t�ְ�ӵ�: " + myNewCar.maxSpeed);
		System.out.print("\t����ӵ�: " + myNewCar.speed);
		

		System.out.println("\n=========================");
		
		Car myNewCar2 = new Car("K3","����"); 
		System.out.print("����ȸ��: " + myNewCar2.company); 
		System.out.print("\t�𵨸�: " + myNewCar2.model);
		System.out.print("\t����: " + myNewCar2.color);
		System.out.print("\t�ְ�ӵ�: " + myNewCar2.maxSpeed);
		System.out.print("\t����ӵ�: " + myNewCar2.speed);


		System.out.println("\n=========================");
		
		Car myNewCar3 = new Car("BMW","�Ͼ�",200); 
		System.out.print("����ȸ��: " + myNewCar3.company); 
		System.out.print("\t�𵨸�: " + myNewCar3.model);
		System.out.print("\t����: " + myNewCar3.color);
		System.out.print("\t�ְ�ӵ�: " + myNewCar3.maxSpeed);
		System.out.print("\t����ӵ�: " + myNewCar3.speed);

	
	}

}
