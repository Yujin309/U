package Test;

public abstract class B {
public  void m1() {
	
		System.out.println("%%%%쌀밥%%%");
}
	
	protected void mustCall()	{
		//다른 패키지에서 부를수 없음. -> sub class에서는 사용 가능 
		
			System.out.println("mustCal()");
	}
	protected void mustSubOverride() {//선언 {를 body라고 함. 
		
			System.out.println("mustSubOverrid()");//
	}
		protected abstract void  overriding();
//protected abstract void overriding() ; 강제성을 띄고 싶을때 붙여줌  {가 없어햐 한다. 
		//메소드에 abstract붙이면 Class에도 abstract 써야함. 
}
