package app;

//������ Ÿ�� �� ����ȯ (������, �����)
public class CastEx {

	public static void main (String[] args) {
		byte byte1 = 127;
		short short1;
		char char1 = 10;
		int int1;
		long long1;
		
		float float1;
		double double1;
		
		short1 = byte1;	// byte (1byte) => short (2byte)
		int1  = short1;	// short(2byte) => int   (4byte)
		int1 = char1;	// char (2byte) => int   (4byte)
		long1 = int1;	// int  (4byte) => long  (8byte) 
		float1 = int1;	// int  (4byte) => float (4byte)
		double1 = long1;// long (8byte) => double(8byte)
		
		
		//casting�����ڷ� ����� ����ȯ�� �Ѵ�.
		byte1 = (byte)short1; //����Ÿ �ս� �ɼ� ����
		int1 = (int)long1;    //����Ÿ �ս� �ɼ� ����  
	}
}
