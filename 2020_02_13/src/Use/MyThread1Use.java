package Use;

import 스레드.MyThread1;

public class MyThread1Use {
	public static void m() {
		Thread thread = new MyThread1("#2");
		thread.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new MyThread1("#1");// 기초클래스의 레퍼런스(스레드)는 서브클래스의 인스턴스를 참조한다.
		thread.start();

		m();
		System.out.println(Thread.currentThread());

	}

}
