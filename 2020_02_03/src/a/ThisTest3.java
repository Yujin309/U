package a;

public class ThisTest3 {
private String name;
private int age;

public ThisTest3() {
	System.out.println("���࿡");
	System.out.println("��� �����ڿ��� �������� ó���� ������");
	System.out.println("������ �ִٸ�");
	System.out.println("////////////////////");

	
}

public ThisTest3(String name, int age) {
	this(); 
	//this(name);
	
	this.name = name;
	this.age = age;
//�ҽ�-generate using~~���� ���� ���� 

}

public ThisTest3(String name) {
	this();
	this.name = name;
}

public ThisTest3(int age) {
this();

	this.age = age;

}

}
