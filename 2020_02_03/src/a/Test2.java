package a;
public class Test2 {
static private int max;
static public final int MIN=13;
static private final int FIRST; 
//static�� ������ ������ ���� �ڸ��� ����ִ°��̴�. 
private final double rate;
static {

	System.out.println("Static ��");
FIRST=MIN/3;
//s�� ����� �ʱ�ȭ �ϰ� �ʹ�= �����ڿ��� �Ұ���, 
}
//�ٷ� �����ڿ��� ���� ����=> ���̳ο� ���� �������鶩, ������ �ڸ����� ����Ŀ� ���� ����� �־��൵ ��. ������ �ȶ�. 

public Test2(){
	max=677;
System.out.println("������");
//���̳��̳� �Ϲ����� �ν��Ͻ������� ���⼭ �ʱ�ȭ �����ش�. 	
	rate=MIN*9.9;
}
//FIRST=1;//final�� �����ڿ��� ���� ����  
	
	static public void method() {
	System.out.println("Static�� method");
	
	
}
public static void main(String[] args) {//Start
		// TODO Auto-generated method stub
	//System.out.println("main()	method");
max=90;
	}//end

}
