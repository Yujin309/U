package Test;

public abstract class B {
public  void m1() {
	
		System.out.println("%%%%�ҹ�%%%");
}
	
	protected void mustCall()	{
		//�ٸ� ��Ű������ �θ��� ����. -> sub class������ ��� ���� 
		
			System.out.println("mustCal()");
	}
	protected void mustSubOverride() {//���� {�� body��� ��. 
		
			System.out.println("mustSubOverrid()");//
	}
		protected abstract void  overriding();
//protected abstract void overriding() ; �������� ��� ������ �ٿ���  {�� ������ �Ѵ�. 
		//�޼ҵ忡 abstract���̸� Class���� abstract �����. 
}
