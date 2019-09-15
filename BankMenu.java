package app;

public class BankMenu {
	public static void main ( String[] args) {
		boolean run = true; 

		java.util.Scanner scan = new java.util.Scanner(System.in) ; 

		do{
			System.out.println("---------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------------");

			System.out.println("선택");
			int num = scan.nextInt(); 
			switch (num) {
			case 1: System.out.println("예금"); break;
			case 2: System.out.println("출금"); break; 
			case 3: System.out.println("잔고"); break; 
			case 4: System.out.println("프로그램 종료"); 
					run = false; 
					break;  
			default :
					System.out.println("Wrong answer"); 
				}
		}while (run); 
	}
}
