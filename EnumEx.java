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
//		월요일 ==1
//		화요일 ==2
//		수요일 ==3
//		목요일 ==4
//		금요일 ==5
//		토요일 ==6
//		일요일 ==7

		int day = 1;
		
		switch (day){
			case 1 :
				System.out.println("월요일"); break;
			case 2 :
				System.out.println("화요일"); break;
			case 3 :
				System.out.println("수요일"); break;
			case 4 :
				System.out.println("목요일"); break;
			case 5 :
				System.out.println("금요일"); break;
			case 6 :
				System.out.println("토요일"); break;
			case 7 :
				System.out.println("일요일"); break;
		}
*/
/*
		int day = MONDAY;
		
		switch (day){
			case MONDAY :
				System.out.println("월요일"); break;
			case TUESDAY :
				System.out.println("화요일"); break;
			case WEDNESDAY :
				System.out.println("수요일"); break;
			case THURSDAY :
				System.out.println("목요일"); break;
			case FRIDAY :
				System.out.println("금요일"); break;
			case SATURDAY :
				System.out.println("토요일"); break;
			case SUNDAY :
				System.out.println("일요일"); break;
		}
*/	
		Day day = Day.MONDAY;
		
		switch (day){
			case MONDAY :
				System.out.println("월요일"); break;
			case TUESDAY :
				System.out.println("화요일"); break;
			case WEDNESDAY :
				System.out.println("수요일"); break;
			case THURSDAY :
				System.out.println("목요일"); break;
			case FRIDAY :
				System.out.println("금요일"); break;
			case SATURDAY :
				System.out.println("토요일"); break;
			case SUNDAY :
				System.out.println("일요일"); break;
		}

	
	}


}
