package use;

import a.InterfaceTest1;
import sub.InterfaceTest1Impl;

public class InterFaceTest1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int kor=90;
		if(kor == InterfaceTest1.MAX){

		//static�� Ŭ������ ���� ȣ��Ǿ����� ���̴� 				
		}
		switch(kor) {
			case InterfaceTest1.MAX:	
		}	
		InterfaceTest1Impl test1;
//test1=new InterFaceTest1();		
//�ν��Ͻ��� ������ ���۷����� �����°��̴�. 
//extends�� Ȯ���Ѵ�.��� �ǹ̸� ������ ������, ���: ����(����)�� ������� ���� (�ڽ�)Ȯ��
//sub extends super  ������ ������ Ȯ�� 
//sub implements super ��� �������Ҷ� 
	 test1= new InterfaceTest1Impl();
		//�������̽�: �ν��Ͻ� ���� �� x ==>  ����Ŭ������ �ν��Ͻ��� ���� ���.
		
	 System.out.println(InterfaceTest1Impl.MAX);
	test1.method("fkfjkl");
	test1.method2();
	InterFaceTest1.method3();
	InterfaceTest1Impl.method3();
		}
	private static void method3() {
		// TODO Auto-generated method stub	
	}
//�����Ͻ������� ����Ŭ������ ���� �޼ҵ�� �����ϰ� ����ÿ� ����Ŭ������ ���� 
}
