package staticTest;

public class Test3 {
static private double rate=3.7;  //Ŭ���� ���� 
private String name; //�ν��Ͻ� ����

public void method() {  //�ν��Ͻ��� ������ ȣ��Ǵ� ��
	System.out.println(rate+ " " +name);
	}
//nonStatic������ static�� ����� ����Ҽ��ִ�. 

static public void method2() {  //Ŭ������ ���� ȣ��Ǿ����� ������
	//System.out.println(rate+ " " +name);
/**System.out.println(rate+ " " +name);
 * ������ ������ ����: ����ƽ�� �޼ҵ忡���� nonStatic�� ������ ����Ҽ� ����. 
 */
}

}
