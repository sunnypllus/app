package app;

public class SwitchEx {
	//���ǽ��� ��쿡�� ����IF����, ���� ��쿡�� switch case������ ���
	// switch ~ case ��
	/* ǥ��)
		switch (��) {	//����x,��0, ��������̾��µ� v1.7���� ���ڿ����� ������. ����if���� �ӵ��� ����
		case ��1:
			���౸��1;
			break; //���� 
		case ��2:
			���౸��2;
			break; //����
		case ��3:
			���౸��3;
			break; //����
		.
		.
		default :
			���౸��4;
			break; //����
		}
	 */
	public static void main(String[] args) {
		System.out.print("���Է�:");
		int x = new java.util.Scanner(System.in).nextInt();
		
		switch (x) {
		case 1:
			System.out.println("���౸��1"); 
			break;
		case 2:
			System.out.println("���౸��2"); 
			break;
		case 3:
			System.out.println("���౸��3"); 
			break;
		default:
			System.out.println("�⺻���౸��"); 
			break;
		}
	}

}
