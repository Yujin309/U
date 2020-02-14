package oop;

public class 은닉성Samlpe2Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		은닉성Sample2 ref1;
		ref1=new 은닉성Sample2();
		//은닉성 샘플2 메모리 할당시켜라 
		//메모리상에 동적으로 실행할때 (동적)-> 메모리 할당 시켜라 
		ref1.kor=100;
		ref1.method();
		String s;//멤버변수
	//	System.out.println(s);
//지역변수는 초기화를 하지 않으면 사용불가
		
		//boolen은 flase가 디폴트 
		//kor=40;//속해있지 않아서 쓸수없음
		
	}

}
