package use;

import staticTest.Test2;

public class Test2Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2.staticVariable= 89;
//Test2.nonStaticVariable=89;= cannot make a static reference to the non-static field Test2.nonStaticVariable
	Test2 t2Ref = new Test2();
	t2Ref.nonStaticVariable=89;
	t2Ref.output();
	
	Test2 t2Ref2=new Test2();
	t2Ref.nonStaticVariable=100;
	t2Ref.output();
	
	Test2 test2=new Test2();
	test2.nonStaticVariable=200;
	test2.output();
	//////////////////////////////////////////
	test2.staticVariable=777;
	t2Ref.output();
	t2Ref2.output();
	test2.output();
	//Static 멤버변수는 인스턴스가 잡힐때마다 공유해서 사용 
	//
	}

}
