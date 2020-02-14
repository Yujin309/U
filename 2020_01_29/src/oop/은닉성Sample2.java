package oop;

public class 은닉성Sample2 {
//변수 , 필드 , 속성, 
	
	int kor;
	String name;
	//method 지역변수 
	//초기화되는것 숫자는 0으로 
	//원시자료형 
	//null참조하는 주소가 없다. 
	
	void method() {
		System.out.println(kor*10 + " "+ name);
		//멤버 변수를 처리하거나 
		//inner class: 
		class 기생충 {
			String type;
			void method( ) {
				
			}
		}
	}
}
