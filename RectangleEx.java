package app;

public class RectangleEx {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); 
		int result ; 

		//���簢�� ���� ���ϱ� 
		result = rect.area (10); 
		System.out.println ( "���簢�� ��="+ result );
		
		//���簢�� ���� ���ϱ�
		result = rect.area (10, 5); 
		System.out.println ( "���簢�� ��="+ result );
		
	}

}
