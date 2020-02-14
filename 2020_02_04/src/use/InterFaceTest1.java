package use;

import a.InterfaceTest1;
import sub.InterfaceTest1Impl;

public class InterFaceTest1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int kor=90;
		if(kor == InterfaceTest1.MAX){

		//static은 클래스에 의해 호출되어지는 것이다 				
		}
		switch(kor) {
			case InterfaceTest1.MAX:	
		}	
		InterfaceTest1Impl test1;
//test1=new InterFaceTest1();		
//인스턴스가 참조할 레퍼런스가 잡히는것이다. 
//extends는 확장한다.라는 의미를 가지고 있지만, 상속: 기초(슈퍼)를 기반으로 하위 (자식)확장
//sub extends super  동일한 곳에서 확장 
//sub implements super 모두 재정의할때 
	 test1= new InterfaceTest1Impl();
		//인터페이스: 인스턴스 만들 수 x ==>  서브클래스에 인스턴스를 만들어서 사용.
		
	 System.out.println(InterfaceTest1Impl.MAX);
	test1.method("fkfjkl");
	test1.method2();
	InterFaceTest1.method3();
	InterfaceTest1Impl.method3();
		}
	private static void method3() {
		// TODO Auto-generated method stub	
	}
//컴파일시점에서 기초클래스가 가진 메소드와 맵핑하고 실행시엔 서브클래스를 실행 
}
