package a;

public class ThisTest {
		private String name;
		private int age;

public ThisTest() {
	System.out.println("�ν��Ͻ� ������ġ"+this.hashCode());
}
public ThisTest(String name) {
	this.name=name;
}

public ThisTest(String n, int a) {
	name=n;
	age=a;
	System.out.println("�ν��Ͻ� ������ġ "+this.hashCode());
	}
public void output() {
	System.out.println("output()�� ȣ���� �ν��Ͻ� ��ġ :"+this.hashCode()+
			"�ν��Ͻ��� age: "+age+"�̸�: "+name);

}
}
