package app;

public class SingletonEx {
	public static void main (String[] args) {
//
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();  
		
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		if ( obj3 == obj4) {
			System.out.println("���� Singleton ��ü�Դϴ�"); 
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�");
		}
		if ( obj3.equals(obj4)) {
			System.out.println("���� Singleton �Դϴ�"); 
		} else {
			System.out.println("�ٸ� Singleton �Դϴ�");
		}
				
		
	}
}


class Singleton{
	private  static Singleton instance = new Singleton(); 
	private Singleton() {}
	static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton(); 
		}
		return instance; 
	}
}
