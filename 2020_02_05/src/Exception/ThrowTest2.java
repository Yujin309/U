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
	                                    //��Ÿ�� exception unchecked 
	if(a==0) {//�ܺο����� ȣ���ؼ� ó���Ҽ�����! 
		
		throw new MyException("0�� �ƴ� ���� �Է��ϼ���.");
		//exception ���������°�  checked exception ��Ÿ�ӿ��� ���ܵȰ�.?
	}
	return a/b;
}
public void init() {//���� �޼ҵ忡�� ����Ұ��̹Ƿ� ���� �޼ҵ���� �̼��� ó���ؾ���. 
	//init���� ������ �� ����. 
try {
	c= calc(a,b);//try�� �̼��� ó�����ش�.
	}catch (ArithmeticException e) {
		//���ܹ߻� ���ΰ� ����Ȳ�� ��� ����� �ִ��� 
		//�����ϴ� ����� ó�� ������ ���
	e.printStackTrace();
	
	}catch(MyException e) {
	System.out.println("dsfsfdfs");
	
	}catch (Exception e) {
	System.out.println(e.getMessage());
}


}
//ȣ�� ����
public void output() { //��¸� �� ��. 
	System.out.println(a+"/"+b+"="+c);
}

}
