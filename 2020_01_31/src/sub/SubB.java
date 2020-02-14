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
		System.out.println("%%%%쌀밥%%%");
}
	
	public void output() {
		mustCall(); 
	}
	
	protected abstract void overriding() ; 
} //f2누르면 문제 해결가능 