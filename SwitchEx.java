package app;

public class SwitchEx {
	//조건식일 경우에는 다중IF문로, 값일 경우에는 switch case문으로 사용
	// switch ~ case 문
	/* 표현)
		switch (값) {	//수식x,값0, 상수가능이었는데 v1.7부터 문자열까지 가능함. 다중if보다 속도가 빠름
		case 값1:
			실행구문1;
			break; //선택 
		case 값2:
			실행구문2;
			break; //선택
		case 값3:
			실행구문3;
			break; //선택
		.
		.
		default :
			실행구문4;
			break; //선택
		}
	 */
	public static void main(String[] args) {
		System.out.print("수입력:");
		int x = new java.util.Scanner(System.in).nextInt();
		
		switch (x) {
		case 1:
			System.out.println("실행구문1"); 
			break;
		case 2:
			System.out.println("실행구문2"); 
			break;
		case 3:
			System.out.println("실행구문3"); 
			break;
		default:
			System.out.println("기본실행구문"); 
			break;
		}
	}

}
