package app;

public class IfEx2 {
	/* ��� ( ���� ���ǹ�)
	 ǥ��)
	 	if (���ǽ�1 ) {
	 		���౸��1;
	 	} else if {
	 		���౸��2;
	 	}
	 */
	public static void main(String[] args) {
/*
		int score = 70;
		//ex1
		if (score > 50 && score < 81) {
			System.out.println("���౸��1"); 
		} else if (score < 91) {
			System.out.println("���౸��2");
		}

		//ex2
		if (score > 50 && score < 81) {
			System.out.println("���౸��1"); 
		} else {
			System.out.println("���౸��2");
		}
		
		if (score > 80 && score < 91) {
			System.out.println("���౸��3"); 
		} else {
			System.out.println("���౸��4");
		}
		*/
		
		//���빮��
		System.out.print("����:");
		int score2 = new java.util.Scanner(System.in).nextInt(); 
		char char2 = ' ';
		
		
//		 0~ 60 : C
//		61~ 80 : B
//		81~100 : A

		
		//���� if 
		if (score2>=0 && score2 < 61) {
			System.out.println ("C");
		}
		if ( score2>60 && score2< 81) {
			System.out.println ("B");
		}
		if ( score2>80 && score2< 101) {
			System.out.println ("A");
		}
		

		//���� if-else 
		if (score2>=0 && score2 < 61) {
			System.out.println ("C");
		} else if (score2< 81) {
			System.out.println ("B");
		} else if (score2< 101) {
			System.out.println ("A");
		}
		
		
		//���� 3�׽�
		char2 = (score2>= 0 && score2<61) ? 'C' : ( score2< 81) ? 'B' : 'A'; 
		System.out.println (char2);
	}

	
}
