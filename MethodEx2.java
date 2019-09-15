package app;

public class MethodEx2 {

	//����1) 1~100���� ���� ���ϴ� �Լ��� ���� �ϰ� ����� �޾� ����Ͻÿ�. return type ��� 
	//����2) ������ 9�ܱ��� ����Ͻÿ�.(�޼ҵ� ���)
	//����3) ������ 7���� ����Ͻÿ�(���� ���)
	//����4) ������ 3�� ����� �� ��ȯ ����Ͻÿ� ( ���ڻ��, ��ȯ �޼ҵ� ���) 
	//����5) ������ 3, 5, 7 ���� �迭�� ����� �������� ����Ͻÿ� (���� ���) 
	public static void main(String[] args) {
		    System.out.println("����1) 1~100����1) 1~100���� ���� ���ϴ� �Լ��� ���� �ϰ� ����� �޾� ����Ͻÿ�. return type ���"); 
			int sum = methodAdd();
			System.out.println("1~100�� : "+ sum);
			System.out.println("����2) ������ 9�ܱ��� ����Ͻÿ�.(�޼ҵ� ���)");
			methodGugudan();
			System.out.println("����3) ������ 7���� ����Ͻÿ�(���� ���)"); 
			System.out.println("�Է��ϼ���>");
			int gugu = new java.util.Scanner(System.in).nextInt();
			methodGugudanSeven(gugu);
			System.out.println("\n"); 
			System.out.println("����4) ������ 3�� ����� �� ��ȯ ����Ͻÿ� ( ���ڻ��, ��ȯ �޼ҵ� ���)"); 
			System.out.println("�Է��ϼ���>");
			gugu = new java.util.Scanner(System.in).nextInt();
			int threeSum = methodGugudanThree(gugu);
			System.out.println("����5) ������ 3, 5, 7 ���� �迭�� ����� �������� ����Ͻÿ� (���� ���)");
			int[] inArr = {3,5,7}; 
			methodGugudanArray(inArr);
	}


	public static void methodGugudanArray (int[] dan) {

		for (int curDan : dan) {
			for (int k=1; k<=9; k++) {
				System.out.print(curDan +"x" + k +"="+ curDan *k +"\t");
			}
			System.out.print("\n");
		}
 
	}

	public static int methodGugudanThree (int gugu) {
		int i = gugu;
		int sum = 0; 
			for (int k=1; k<=9; k++) {
				//System.out.print(i+"x" + k +"="+ i*k +"\t");
				sum += (i* gugu ); 
			}
		return sum; 
	}

	public static void methodGugudanSeven (int gugu) {
		int i = gugu;
		
			for (int k=1; k<=9; k++) {
				System.out.print(i+"x" + k +"="+ i*k +"\t"); 
			}
	}
	public static void methodGugudan () {
		for (int i=2; i<=9; i++) {
			for (int k=1; k<=9; k++) {
				System.out.print(k+"x" + i +"="+ i*k +"\t"); 
			}
			System.out.print("\n"); 
		}
	}
	public static int methodAdd () {
		int sum =0;
		for (int i=0; i<100; i++) {
			sum += i+1;
		}
		return sum ; 
	}

}
