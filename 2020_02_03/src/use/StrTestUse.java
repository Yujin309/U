package use;

import str.Test1;

public class StrTestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 t1 = new Test1();
Test1 t2 = new Test1();
//�׽�Ʈ1�� ����Ŭ������ ������Ʈ �̴�. 
System.out.println(t1);
System.out.println(t2.toString());
	
	String ref=t2.toString();
	//������Ʈ�ΰ��� ��Ʈ��ȭ �ϰ������ toString�ϸ� �ȴ�. 
	//������ println�� �˾Ƽ� �ڵ����� ȣ�����ֱ� ������ print(t2)�� ���ٰ� �����ִ� . 
	
	
	}

}
