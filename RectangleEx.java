package app;

public class RectangleEx {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); 
		int result ; 

		//정사각형 넓이 구하기 
		result = rect.area (10); 
		System.out.println ( "정사각형 합="+ result );
		
		//직사각형 넓이 구하기
		result = rect.area (10, 5); 
		System.out.println ( "직사각형 합="+ result );
		
	}

}
