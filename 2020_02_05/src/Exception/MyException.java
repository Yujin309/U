package Exception;

public class MyException extends Exception {
//�̼��� ������ذ� �����ϱ����� throw���� ���ѱ�� ���� throws
	//try catch�� ��� ĳġ���� ������ �ִ�. �Ƹ���ƽ, ������ ����� ������ �̵��� ����Ŭ������ �̼����̱� ������ �ؿ��ٰ� �־���Ѵ� 
	
	
	public MyException() {
	// TODO Auto-generated constructor stub

	
	super("���� 0���� �Է��ؼ� �߻��� ���ܻ���");
} 
public MyException(String msg) {
	// TODO Auto-generated constructor stub
super("msg");
} 
}
