package app;

public class OperEx6 {

	/*
	����, ���� ������ 
	����)
		--
		++
		int a =0;
		++a // 1
		--a // 0
	 */
	public static void main(String[] args) {
		int a = 0;
		System.out.println (++a);
		System.out.println (--a);
		System.out.println (a++);
		System.out.println (a--);
		System.out.println (a);

		
		System.out.println (a++ + a++);  //1
		System.out.println (a+ --a + ++a);  //5
		System.out.println (--a + a++);  //2
		System.out.println (a);  //2

	}

}
