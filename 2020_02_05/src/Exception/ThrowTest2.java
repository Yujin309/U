package Exception;

public class ThrowTest2 {
private int a;
private int b;
private int c;

public ThrowTest2(int a,int b) {
	this.a=a;
	this.b=b;
}
	public int calc(int a, int b)throws ArithmeticException, MyException{
	                                    //런타임 exception unchecked 
	if(a==0) {//외부에서도 호출해서 처리할수있음! 
		
		throw new MyException("0이 아닌 수를 입력하세요.");
		//exception 던져버리는것  checked exception 런타임에서 제외된것.?
	}
	return a/b;
}
public void init() {//메인 메소드에서 사용할것이므로 메인 메소드까지 이셉션 처리해야함. 
	//init에서 가져다 쓴 것임. 
try {
	c= calc(a,b);//try로 이셉션 처리해준다.
	}catch (ArithmeticException e) {
		//예외발생 원인과 현상황을 어떻게 벗어날수 있는지 
		//유도하는 문장과 처리 문장을 기술
	e.printStackTrace();
	
	}catch(MyException e) {
	System.out.println("dsfsfdfs");
	
	}catch (Exception e) {
	System.out.println(e.getMessage());
}


}
//호출 문장
public void output() { //출력만 할 것. 
	System.out.println(a+"/"+b+"="+c);
}

}
