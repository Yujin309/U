package use;

import staticTest.Test1;

public class StaticTestUse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Test1 ref = new Test1();
 ref.nonStaticMethod1();
 ref.staticMethod1();
 
 Test1.staticMethod1();
 Test1.nonStaticMethod1();
 
 //10�� 14���� ����ε� ���̴�.
 // nonStaticMethod1();= �ν��Ͻ��� ���� ȣ���� �Ǿ���. /Static�� ������ �ν��Ͻ��� ��� �ȴ�.
int num= Integer.parseInt("123");
//Static �� �޼ҵ���. 

	}

}
