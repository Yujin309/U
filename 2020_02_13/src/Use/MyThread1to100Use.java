package Use;

import 스레드.MyThread1to100;

public class MyThread1to100Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main()  시작");
		Thread thread = new MyThread1to100("#1");
		Thread thread2 = new MyThread1to100("#2");
		Thread thread3 = new MyThread1to100("#3");

		thread.start();
		thread2.start();
		thread3.start();

		System.out.println("메인 종료전");

	}

}
