
package ����;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverTest_Param2 {

	static public void callAA(AA ref) {

		System.out.println("callAA(AA ref) ");

		ref.m1();

	}

	public static void main(String[] args) {

		callAA(new SubAA());

		System.out.println("//////////////");

		callAA(new BBAA());

		System.out.println("//////");
		System.out.println(new Date());
		System.out.println(new BBAA());
		System.err.printf("%d,10");
//10�� ��Ƽ�� Ÿ���� �޾���! 
		AA aaa = new SubAA();
		AA aa22 = new BBAA();
		SubAA rrr = (SubAA) aaa;
			  rrr = (SubAA) aa22;

		// ���������� ���� : ���۷��� ��ü Ÿ���� sub aa Ÿ��..
//�����ϴ� ��ü�� �����Ŀ� ���� �ٸ���. 
	
	int qq=10;
	Integer ii = new Integer(qq);
	ii=qq;
	qq= new Integer(99);//wrapperŬ����: �����ڷ����� ������ �����ϰ�
	//�޼ҵ�� ��� ������ �߰��ؼ� ���ȭ = ��Ƽ�� ���� clac��
//�����ڷ����� ������Ʈȭ ��Ų�� : wrapper class 
	
	}

}
