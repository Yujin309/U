package Use;

import ������.MyThread1;

public class MyThread1Use {
	public static void m() {
		Thread thread = new MyThread1("#2");
		thread.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new MyThread1("#1");// ����Ŭ������ ���۷���(������)�� ����Ŭ������ �ν��Ͻ��� �����Ѵ�.
		thread.start();

		m();
		System.out.println(Thread.currentThread());

	}

}
