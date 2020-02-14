package Use;

import Exception.ThrowsTest2;

public class ThrowsTest2Use2 {
/**
 * 예외발생된것을 처리하지 않은것 
 * Throws예외를 해결하는 것이 아니라 다음 메소드에 떠 넘기는 것 
 * main을 호출한 JVm에 예외사항을 떠 넘기므로 여전히 예외가 발생한다. 
 * 
 * @param args
 @throws ArithmeticException
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowsTest2 test2= new ThrowsTest2();
System.out.println(test2.calc(4,0));
//메인 메소드에서clac사용중  메인까지 가기 전에 해결해야함 
	}

}
