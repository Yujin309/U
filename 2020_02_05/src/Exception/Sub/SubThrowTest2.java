package Exception.Sub;

import Exception.MyException;
import Exception.ThrowTest2;

public class SubThrowTest2 extends ThrowTest2 {
public void init() throws Exception{
	
	
	
	//����Ŭ������  throws�� ��� �̼��� �Ұ� = ��������¡ �Ҷ�. ����Ŭ������ ���� �޼ҵ� ���¸� �״�� �����ؾ��� 
	
}
	public SubThrowTest2(int a, int b) {
		super(a,b);
			}

	@Override
	public int calc(int a, int b) throws ArithmeticException,MyException {
		// ������ ó�������� �߿����� ����, ���� �������̵�� throws�κп� ���� ��Ģ�� ���� 
		
		return 0;
	
	}

	/**@Override
	public int calc(int a, int b) throws Exception {
		// ������ ó�������� �߿����� ����, ���� �������̵�� throws�κп� ���� ��Ģ�� ���� 
		
		return 0;
	
	}
	*/
	
	
}
