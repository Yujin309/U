package use;

import staticTest.Test1;

public class StaticTestUse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Test1 ref = new Test1();
 ref.nonStaticMethod1();
 ref.staticMethod1();
 
 Test1.staticMethod1();
 Test1.nonStaticMethod1();
 
 //10번 14번이 제대로된 식이다.
 // nonStaticMethod1();= 인스턴스에 의해 호출이 되어짐. /Static이 있으면 인스턴스가 없어도 된다.
int num= Integer.parseInt("123");
//Static 한 메소드임. 

	}

}
