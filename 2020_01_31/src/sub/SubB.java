package sub;
import Test.B;
public abstract class SubB extends B {
//@Override : 
	public void m1(int a) {
for (int i=0;i<a; i++)	{
		System.out.println("/////");
}
	}
	public void m1() {  
		//@ Override
		System.out.println("%%%%�ҹ�%%%");
}
	
	public void output() {
		mustCall(); 
	}
	
	protected abstract void overriding() ; 
} //f2������ ���� �ذᰡ�� 