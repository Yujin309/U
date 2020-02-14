package use;

import methods.C;

public class CUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("KimMalJa");
		C cRef = new C();
		//C타입으로 인스턴스 만들기 
		
		System.out.println("main()==>" +sb);
		cRef.method1(sb);
		System.out.println("main()==>" +sb);
		/**매개 변수 /  실인자 (실질적으로 데려오는 데이터 
		지역 변수
		호출이 될때 매개 변수 임 . 
		for by value: 다른곳에서 수정 불가
		for by Ref :다른곳에서 수정할수 있음. 
		*/
		
		
	}

}

