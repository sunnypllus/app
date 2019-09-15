package app;

public class SwitchEx2 {
	public static void main (String[] args) {
		//String str = "n";

		System.out.print("ют╥б:");
		String str = new java.util.Scanner(System.in).next(); 

		switch (str) {
			case "y":
			case "Y":
				System.out.println("Yes");
				break;
			case "n":
			case "N":
				System.out.println("No");
				break;
			default:
				System.out.println("err");
				break;
				
		}
	}
}
