package app;

public class ArrayEx4 {

	public static void main(String[] args) {
		boolean run = true; 
		java.util.Scanner scan = new java.util.Scanner(System.in); 
		int[] arr = new int[3]; 
		int score; 
		while (run) {
			System.out.print("���� ��ġ ���� (0, 1, 2) : "); 
			int idx = scan.nextInt(); 
			int temp = arr[idx]; 
			System.out.print("���� �Է� : ");
			score = scan.nextInt(); 
			arr[idx] = score + temp; 
			System.out.print("���α׷� ����? (false or true)") ;
			run = scan.nextBoolean();
		}
		System.out.println("arr[0] :" + arr[0]);
		System.out.println("arr[1] :" + arr[1]);
		System.out.println("arr[2] :" + arr[2]);
	}

}
