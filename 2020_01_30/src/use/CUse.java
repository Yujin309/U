package use;

import methods.C;

public class CUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("KimMalJa");
		C cRef = new C();
		//CŸ������ �ν��Ͻ� ����� 
		
		System.out.println("main()==>" +sb);
		cRef.method1(sb);
		System.out.println("main()==>" +sb);
		/**�Ű� ���� /  ������ (���������� �������� ������ 
		���� ����
		ȣ���� �ɶ� �Ű� ���� �� . 
		for by value: �ٸ������� ���� �Ұ�
		for by Ref :�ٸ������� �����Ҽ� ����. 
		*/
		
		
	}

}

