package use;

import str.Test1;

public class StrTestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 t1 = new Test1();
Test1 t2 = new Test1();
//테스트1의 기초클래스가 오브젝트 이다. 
System.out.println(t1);
System.out.println(t2.toString());
	
	String ref=t2.toString();
	//오브젝트인것을 스트링화 하고싶으면 toString하면 된다. 
	//하지만 println은 알아서 자동으로 호출해주기 때문에 print(t2)와 같다고 볼수있다 . 
	
	
	}

}
