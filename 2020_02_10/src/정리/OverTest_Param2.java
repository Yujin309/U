
package 정리;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverTest_Param2 {

	static public void callAA(AA ref) {

		System.out.println("callAA(AA ref) ");

		ref.m1();

	}

	public static void main(String[] args) {

		callAA(new SubAA());

		System.out.println("//////////////");

		callAA(new BBAA());

		System.out.println("//////");
		System.out.println(new Date());
		System.out.println(new BBAA());
		System.err.printf("%d,10");
//10을 인티저 타입이 받아줌! 
		AA aaa = new SubAA();
		AA aa22 = new BBAA();
		SubAA rrr = (SubAA) aaa;
			  rrr = (SubAA) aa22;

		// 에러나오는 이유 : 레퍼런스 자체 타입이 sub aa 타입..
//참조하는 실체가 누구냐에 따라 다르다. 
	
	int qq=10;
	Integer ii = new Integer(qq);
	ii=qq;
	qq= new Integer(99);//wrapper클래스: 원시자료형의 성격을 유지하고
	//메소드와 멤버 변수를 추가해서 기능화 = 인티저 서브 clac등
//원시자료형을 오브젝트화 시킨것 : wrapper class 
	
	}

}
