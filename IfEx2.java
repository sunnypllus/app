package app;

public class IfEx2 {
	/* 제어문 ( 다중 조건문)
	 표현)
	 	if (조건식1 ) {
	 		실행구문1;
	 	} else if {
	 		실행구문2;
	 	}
	 */
	public static void main(String[] args) {
/*
		int score = 70;
		//ex1
		if (score > 50 && score < 81) {
			System.out.println("실행구분1"); 
		} else if (score < 91) {
			System.out.println("실행구분2");
		}

		//ex2
		if (score > 50 && score < 81) {
			System.out.println("실행구분1"); 
		} else {
			System.out.println("실행구분2");
		}
		
		if (score > 80 && score < 91) {
			System.out.println("실행구분3"); 
		} else {
			System.out.println("실행구분4");
		}
		*/
		
		//응용문제
		System.out.print("점수:");
		int score2 = new java.util.Scanner(System.in).nextInt(); 
		char char2 = ' ';
		
		
//		 0~ 60 : C
//		61~ 80 : B
//		81~100 : A

		
		//응용 if 
		if (score2>=0 && score2 < 61) {
			System.out.println ("C");
		}
		if ( score2>60 && score2< 81) {
			System.out.println ("B");
		}
		if ( score2>80 && score2< 101) {
			System.out.println ("A");
		}
		

		//응용 if-else 
		if (score2>=0 && score2 < 61) {
			System.out.println ("C");
		} else if (score2< 81) {
			System.out.println ("B");
		} else if (score2< 101) {
			System.out.println ("A");
		}
		
		
		//응용 3항식
		char2 = (score2>= 0 && score2<61) ? 'C' : ( score2< 81) ? 'B' : 'A'; 
		System.out.println (char2);
	}

	
}
