package app;

public class BankMenu {
	public static void main ( String[] args) {
		boolean run = true; 

		java.util.Scanner scan = new java.util.Scanner(System.in) ; 

		do{
			System.out.println("---------------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("---------------------------");

			System.out.println("����");
			int num = scan.nextInt(); 
			switch (num) {
			case 1: System.out.println("����"); break;
			case 2: System.out.println("���"); break; 
			case 3: System.out.println("�ܰ�"); break; 
			case 4: System.out.println("���α׷� ����"); 
					run = false; 
					break;  
			default :
					System.out.println("Wrong answer"); 
				}
		}while (run); 
	}
}
