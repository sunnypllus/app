package app;

public class IfEx {
	/* ��� (���ǹ�)
	if, else �� ���ǽĿ� ���� ���α׷��� �帧�� �����Ѵ�.
	ǥ��)
		if( ���ǽ� ) {
			���౸��;
		}
		
		if( ���ǽ� ) {
			���౸��1;
		}else {
			���౸��2;
		}
	 */
	public static void main ( String[] args) {
		int num = 10; 
		//ex1
		if ( num > 10) {
			System.out.println("�� �Դϴ�");
		}
		System.out.println("���� ����");
		
		//ex2
		if ( num > 10) {
			System.out.println("�� �Դϴ�");
		}else {
			System.out.println("���� �Դϴ�");
		}
		
	}

}
