package Use;

import Exception.ThrowsTest2;

public class ThrowsTest2Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowsTest2 test2= new ThrowsTest2();
try{
	System.out.println(test2.calc(4,0));
	
}catch (ArithmeticException e) {
	System.out.println(ThrowsTest2Use2.class +"0���� ������ �ȵ�");
}catch (Exception e) {
	e.printStackTrace();
	// TODO: handle exception
}System.out.println("�˼����� ���ܻ��� ");


//���� �޼ҵ忡��clac�����  ���α��� ���� ���� �ذ��ؾ��� 
	}

}
