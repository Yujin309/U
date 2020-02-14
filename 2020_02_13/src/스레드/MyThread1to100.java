package ½º·¹µå;

public class MyThread1to100 extends Thread {
	@Override
	public void run() {
		String name = currentThread().getName();
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + "::" + i);

		}

	}

	public MyThread1to100() {

	}

	public MyThread1to100(String name) {
		super(name);

	}

}
