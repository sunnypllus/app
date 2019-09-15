package app;

public class CalculatorEx {
	public static void main(String[] args) {
	
		Calculator cal = new Calculator(); 
//	
//		cal.execute();
//
//		int ret = cal.plus(10, 5);
//		System.out.println ("°á°ú:"+ret);
//		
		//cal.println(cal.plus(10, 5));

		int[] arrEntry = null;
		String vEntry = null;
		int idx = 0; 
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		vEntry = scan.next();  
		idx++;
		
		switch (vEntry) {
		case "+" : break;
		
		case "-" : break;
		
		case "*" : break;
		
		case "/" : break;
		
		case " " : 
			idx = 0; 
			break;
		
		default : 
			
			break; 
		}
		
	}
	
}
