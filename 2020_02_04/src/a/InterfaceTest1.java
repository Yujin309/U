package a;

public interface InterfaceTest1 {
int MAX=100; 
//앞에 명시 안해도 에러가 안뜸  멤버변수는 파이널이다 . static하다. 
//메소드 보기 
void method ( String msg );
	static void method3() {   
	//static한 것은 바디를 가질수있음
	 System.out.println("InterfaceTest1의 method3()");
//imp는 완벽한 extends이 아님.  
	}
}




