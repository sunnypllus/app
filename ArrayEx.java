package app;

public class ArrayEx {
	/*
	 * �迭 (arrary)
	    - ���� �ڷ����� �����͸� ������ �����ϱ� ���� �޸� ������ ����
	    - ������ �޸� ������ index�� �̿��Ͽ� �� �����Ҹ� ������.
	    - �迭ũ��� length�� ����Ͽ� ����.
	   ǥ��) 
	    - int[] arr = new int[n] //n�� ��ŭ 0���� �ʱ�ȭ.
	    - int[] arr = {1,2,3}; 
	    - int[] arr = new int[]{1,2,3); 
	 */
	public static void main(String[] args) {
		int[] arr = new int[3]; 
		System.out.println("arr[0] :" + arr[0]); 
		System.out.println("arr[1] :" + arr[1]);
		System.out.println("arr[2] :" + arr[2]);
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println("arr[0] :" + arr[0]); 
		System.out.println("arr[1] :" + arr[1]);
		System.out.println("arr[2] :" + arr[2]);
		
		int sum = arr[0]+ arr[1]+ arr[2]; 
		System.out.println("�� :" + sum);
		
		sum = 0; 
		for (int i=0; i<arr.length; i++ ) {
			sum += arr[i]; 
		} 
		System.out.println("for�� �� :" + sum);
		
		int arr2[] = {10, 20, 30}; 
		arr2[2] = 100; 
		for (int i=0; i< arr2.length; i++) {
			System.out.println("arr2["+ i+"]" + arr2[i]); 
		}
		
		//�迭 �ʱ�ȭ ����1 char
		char[] array1 = new char[1]; 
		System.out.println("array1[0] :" + array1[0]+":abc");

		//�迭 �ʱ�ȭ ����2 String
		String[] array2 = new String[1]; 
		System.out.println("array2[0] :" + array2[0]+":abc");
		
		//---------------------------------
		// String �迭 
		//---------------------------------
		String[] str = new String[3]; 
		String[] str2 = {"A","B","C"};
		
		for (int i=0; i<str.length; i++) {
			System.out.println("str["+i+"]"+str[i]); 
		}
		
		str[0] = str2[0]; 
		str[1] = str2[1];
		str[2] = str2[2];

		for (int i=0; i<str.length; i++) {
			str[i]= str2[i]; 
		}
		
		for (int i=0; i<str.length; i++) {
			System.out.println("str["+i+"]"+str[i]); 
		}
		//�迭 ���ؽ� ������ ���� ArrayIndexOutOfBoundsException
		
		
	}
}
