package staticTest;

public class Test2 {
public static int  staticVariable;
 public       int nonStaticVariable;
 /** 
  * 1.�� static �ϰ� 
  * 2.�� nonstatic
  */
public void output() {
	System.out.println(staticVariable + " "+ nonStaticVariable);
	/** staticVariable (4����Ʈ) ������ش�.(����� ������ )  
	 * �ν��Ͻ��� ����� �� ��  �� �����͵� ���� ���� 
	 * �״���  Ref��� ���� �������=> �̰��� ������ ����, ������ ������ ���� Test2 Ÿ������ ���� 
	 * nonStatic mathod (output) ���� �����ڷ� , nonStaticVariable�� �ȴ�.
	 * StaticVariable�� test2�� ��. �׸��� Ref�� ������ -> �����Ϸ� �Ҷ� nonStaticVariable�� ���� 
	 * ������ output�� �ּҰ� ����/ 
	 * static�Ѱ��� �޸𸮻� �ν��Ͻ� �ϱ� ���� ���� ������. 
	 *  �ν��Ͻ��� ����������� nonstatic�� �������.
	 *  ����� ������ġ ��� ����, ��� �������� ���� �Ҵ��� �ְ� -> ��� �޼ҵ尡 �ִ���, �����ּҰ� ����� �޼ҵ� ��
	 *  ȣ�� ���ߴµ� �����ִ°� => static�� ��. 
	 *  static�� ��� ������ ���忡���� ���� ������ �������̴�. ������ staticVariable
	 *  �ֹι�ȣ ������ nonstatic ���� ������� 
	 *  main method��  
	 */
}
}
