package app;

public class ConstructorEx2 {
	int a = 50;
	String b; 
	
	public ConstructorEx2(){
		this("A",50); 
		System.out.println("실행1"); 
	}

	public ConstructorEx2(int a){
		this.a +=a; 
		System.out.println("실행2 " + a);
		
	}

	public ConstructorEx2(String b){
		System.out.println("실행3 "); 
	}
	
	public ConstructorEx2(String a, int b){
		System.out.println("실행4 "); 
	}
	
	
	public static void main(String[] args) { 
		new ConstructorEx2(10); 
	}

}
