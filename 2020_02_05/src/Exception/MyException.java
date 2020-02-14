package Exception;

public class MyException extends Exception {
//이셉션 만들어준것 유발하기위해 throw쓰고 떠넘기기 위해 throws
	//try catch를 사용 캐치절은 순서가 있다. 아리스틱, 마인은 상관이 없지만 이들의 기초클래스가 이셉션이기 때문에 밑에다가 넣어야한다 
	
	
	public MyException() {
	// TODO Auto-generated constructor stub

	
	super("수를 0으로 입력해서 발생한 예외사항");
} 
public MyException(String msg) {
	// TODO Auto-generated constructor stub
super("msg");
} 
}
