package app;


enum Day{
	MONDAY, 
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}; 


public class EnumEx {

//	private final static int MONDAY = 1; 
//	private final static int TUESDAY = 2; 
//	private final static int WEDNESDAY = 3; 
//	private final static int THURSDAY = 4; 
//	private final static int FRIDAY = 5; 
//	private final static int SATURDAY = 6; 
//	private final static int SUNDAY = 7;
//	
	public static void main(String[] args) {
/*
//		������ ==1
//		ȭ���� ==2
//		������ ==3
//		����� ==4
//		�ݿ��� ==5
//		����� ==6
//		�Ͽ��� ==7

		int day = 1;
		
		switch (day){
			case 1 :
				System.out.println("������"); break;
			case 2 :
				System.out.println("ȭ����"); break;
			case 3 :
				System.out.println("������"); break;
			case 4 :
				System.out.println("�����"); break;
			case 5 :
				System.out.println("�ݿ���"); break;
			case 6 :
				System.out.println("�����"); break;
			case 7 :
				System.out.println("�Ͽ���"); break;
		}
*/
/*
		int day = MONDAY;
		
		switch (day){
			case MONDAY :
				System.out.println("������"); break;
			case TUESDAY :
				System.out.println("ȭ����"); break;
			case WEDNESDAY :
				System.out.println("������"); break;
			case THURSDAY :
				System.out.println("�����"); break;
			case FRIDAY :
				System.out.println("�ݿ���"); break;
			case SATURDAY :
				System.out.println("�����"); break;
			case SUNDAY :
				System.out.println("�Ͽ���"); break;
		}
*/	
		Day day = Day.MONDAY;
		
		switch (day){
			case MONDAY :
				System.out.println("������"); break;
			case TUESDAY :
				System.out.println("ȭ����"); break;
			case WEDNESDAY :
				System.out.println("������"); break;
			case THURSDAY :
				System.out.println("�����"); break;
			case FRIDAY :
				System.out.println("�ݿ���"); break;
			case SATURDAY :
				System.out.println("�����"); break;
			case SUNDAY :
				System.out.println("�Ͽ���"); break;
		}

	
	}


}
