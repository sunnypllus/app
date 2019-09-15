package app;

public class MethodEx2 {

	//문제1) 1~100까지 합을 구하는 함수를 정의 하고 결과를 받아 출력하시요. return type 사용 
	//문제2) 구구단 9단까지 출력하시오.(메소드 사용)
	//문제3) 구구단 7단을 출력하시오(인자 사용)
	//문제4) 구구단 3단 결과의 합 반환 출력하시오 ( 인자사용, 반환 메소드 사용) 
	//문제5) 구구단 3, 5, 7 단을 배열로 만들어 구구단을 출력하시오 (인자 사용) 
	public static void main(String[] args) {
		    System.out.println("문제1) 1~100문제1) 1~100까지 합을 구하는 함수를 정의 하고 결과를 받아 출력하시요. return type 사용"); 
			int sum = methodAdd();
			System.out.println("1~100합 : "+ sum);
			System.out.println("문제2) 구구단 9단까지 출력하시오.(메소드 사용)");
			methodGugudan();
			System.out.println("문제3) 구구단 7단을 출력하시오(인자 사용)"); 
			System.out.println("입력하세요>");
			int gugu = new java.util.Scanner(System.in).nextInt();
			methodGugudanSeven(gugu);
			System.out.println("\n"); 
			System.out.println("문제4) 구구단 3단 결과의 합 반환 출력하시오 ( 인자사용, 반환 메소드 사용)"); 
			System.out.println("입력하세요>");
			gugu = new java.util.Scanner(System.in).nextInt();
			int threeSum = methodGugudanThree(gugu);
			System.out.println("문제5) 구구단 3, 5, 7 단을 배열로 만들어 구구단을 출력하시오 (인자 사용)");
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
