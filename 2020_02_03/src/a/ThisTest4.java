package a;

public class ThisTest4 {
private String name;
private int age;

public ThisTest4() {
	super();
	
	System.out.println("���࿡");
	System.out.println("��� �����ڿ��� �������� ó���� ������");
	System.out.println("������ �ִٸ�");
	System.out.println("////////////////////");

	
}

public ThisTest4(String name, int age) {
	super();
	
	
	
	this.name = name;
	this.age = age;
//�ҽ�-generate using~~���� ���� ���� 

}

public ThisTest4(String name) {
	this();
	this.name = name;
}

public ThisTest4(int age) {
this();

	this.age = age;

}

}
