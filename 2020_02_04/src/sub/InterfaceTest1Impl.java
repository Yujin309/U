package sub;

import a.InterfaceTest1;

public class InterfaceTest1Impl implements InterfaceTest1 {

	private String msg;
	//����: �������̽� ����� �޾ұ⿡ implements�� �޾ƾ���. 
	/**
	 * 
	 */
	@Override
	public void method(String msg ) {
	}
	public InterfaceTest1Impl() {
		// TODO Auto-generated constructor stub
	System.out.println("overriding�� �޼ҵ�===="+ msg);
//�������̵��Ҷ� �ۺ��� �ٿ�����Ѵ�. 
}
public void method2() {//�������̽��� ���°��̶� ȣ�� �Ұ�
	System.out.println("method2()");}
	static public void method3() {
	System.out.println("InterfaceTest1Impl�� method3()");
	//�������̵� �Ѱ��� �ƴ�, stat�ѰͿ� ���� �͵��� �������̽��� ���� ȣ���� �Ǿ���
	//����� �޾� ���� ����. 
	
	}


}
