package javabook.ch3;


public class Ch3Ex2 {

public static void main(String[] args) { //args�� ���� main local 
	byte num1 = 'A' ;  // A-> 65 
	System.out.println(num1); 
	num1 = 'B'; //���Ե�. byte(-128~127) ���� ���� ���ϱ� ������
				//num1=900;
	int alpha ='A';
	System.out.println(alpha);
	System.out.printf("������ : %c, %d\n",alpha,alpha);
	alpha = alpha + 10;  //�����ʺ��� �о��
	char ch =(char)alpha; // int���� char�� �Ἥ ����, (char) : ����� ����ȯ, ���� ����ȯ 
	char ch2 = 'A'+ 10; // 'A'=����, 75�� char ������ �ֱ⶧���� ����
	char ch3;
		ch3='A' +10; //��â�� ���������� ����, ���� + ������ ������ �������� int���� �ٲ㼭 ����ϱ� ������ 
					 //���� ���� ���ϱ� ������ ����x
		
//printf = print format 
	
}
}
