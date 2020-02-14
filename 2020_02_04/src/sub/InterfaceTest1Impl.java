package sub;

import a.InterfaceTest1;

public class InterfaceTest1Impl implements InterfaceTest1 {

	private String msg;
	//에러: 인터페이스 상속을 받았기에 implements를 받아야함. 
	/**
	 * 
	 */
	@Override
	public void method(String msg ) {
	}
	public InterfaceTest1Impl() {
		// TODO Auto-generated constructor stub
	System.out.println("overriding한 메소드===="+ msg);
//오버라이딩할때 퍼블릭을 붙여줘야한다. 
}
public void method2() {//인터페이스가 없는것이라 호출 불가
	System.out.println("method2()");}
	static public void method3() {
	System.out.println("InterfaceTest1Impl의 method3()");
	//오버라이딩 한것이 아님, stat한것에 들어가는 것들은 인터페이스에 의해 호출이 되어짐
	//상속을 받아 쓸수 없다. 
	
	}


}
