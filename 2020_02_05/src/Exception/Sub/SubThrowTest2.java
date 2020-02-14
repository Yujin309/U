package Exception.Sub;

import Exception.MyException;
import Exception.ThrowTest2;

public class SubThrowTest2 extends ThrowTest2 {
public void init() throws Exception{
	
	
	
	//기초클래스에  throws가 없어서 이셉션 불가 = 오버라이징 할때. 기초클래스가 가진 메소드 상태를 그대로 보존해야힘 
	
}
	public SubThrowTest2(int a, int b) {
		super(a,b);
			}

	@Override
	public int calc(int a, int b) throws ArithmeticException,MyException {
		// 지금은 처리문장이 중요하지 않음, 단지 오버라이드시 throws부분에 대한 규칙을 본다 
		
		return 0;
	
	}

	/**@Override
	public int calc(int a, int b) throws Exception {
		// 지금은 처리문장이 중요하지 않음, 단지 오버라이드시 throws부분에 대한 규칙을 본다 
		
		return 0;
	
	}
	*/
	
	
}
