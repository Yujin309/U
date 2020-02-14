package Use;

import Exception.ThrowsTest2;

public class ThrowsTest2Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowsTest2 test2= new ThrowsTest2();
try{
	System.out.println(test2.calc(4,0));
	
}catch (ArithmeticException e) {
	System.out.println(ThrowsTest2Use2.class +"0으로 나누면 안됨");
}catch (Exception e) {
	e.printStackTrace();
	// TODO: handle exception
}System.out.println("알수없는 예외사항 ");


//메인 메소드에서clac사용중  메인까지 가기 전에 해결해야함 
	}

}
