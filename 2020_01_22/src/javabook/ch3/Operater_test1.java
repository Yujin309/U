package javabook.ch3;

public class Operater_test1 {
	public static void main(String[] args) {
		System.out.println(4./5.);
		System.out.println(4/(double)5); // ĳ���� ������ double �Ἥ �Ǽ��� ����� ������, 
		System.out.println(4%5); 

		
		int a=4;
		int b=5;
		System.out.println(a/(double)b); // ������ double��ȭ , b�� �״�� int 
		System.out.println(4/5); //����� �Ǽ��� ���� ���� .��� ���� ���ϰ� ����
		System.out.println(4>>1);
		System.out.println(4<<1);
		// ��Ʈ �� 
		int cc= 4 & 5;
		System.out.println(cc);
		int dd= 4 | 5;
		System.out.println(dd);
		int ee= 4 ^ 5;
		System.out.println(ee);
		
		System.out.println(80 >= 90);
		//not ������ ����?
		System.out.println("!!!!"+! (80 >= 90));

		
		System.out.println("80" instanceof String ); //"80" ���ڿ��� String�� instance �ΰ�? Ÿ�� Ȯ�� , �����ڷ��� X 
		// System.out.println(80 instanceof Integer ); 
		
		
		int Num1 = 30;
		int Num2 = 14;
		System.out.printf("%d\n", Num1++ ); //30 ������ ����? , () �����ڰ� �켱������ �� ���Ƽ� 
		System.out.printf("%d\n", --Num1);
		
		int x1=30; long y1=4;
		double z1= x1/y1; 
		//double z1= (double)x1/(double)y1;
		double z2= (double)x1/(double)y1;
		System.out.println(30/4);
		System.out.println("30/4="+z1);  //7.5��� ������ �ʴ�����? ������ ������ ����, double���̶� .0���� ���
		
		System.out.println("30/4="+z1+","+z2);
		

	}
}
