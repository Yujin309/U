package b;

public class SubClassDa extends SuperClassDa{
	private String name="�⺻��";
	
	private int age=10;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void output() {
		System.out.println("����:"+age);
		System.out.println("������ age:"+super.getAge());
		//getAge�� ������, �θ� Ŭ�����̱� ������ �������� ����. ����Ŭ������ ���� age�� 
		//�����;���. �׷��� �ƿ�ǲ�� ȣ���� �ν��Ͻ��� ����Ŭ���� �ν��Ͻ��̴�. �׷��� ����Ŭ������ ���� �����ü��ִ�. 
		
		System.out.println("�ּ�:"+ getAddr());
		System.out.println("����:"+gender);
		//addr�� private�ϱ� �����̴�. 
		//�ڽ�Ŭ���������� �������� ���ϰ� �Ϸ��� private
		//protect�ϰ� �ƴϸ� getter setter�� ����, 
	}

//���� Ŭ���� �� 

}
