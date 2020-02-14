package 스레드;

public class MyThreadSleep extends Thread {

	@Override

	public void run()/* throws InterruptedException */ {

		String name = currentThread().getName();

		for (int i = 1; i <= 5; i++) {

			System.out.println(name + "::" + i);

			try {

				System.out.println(name + "스레드 sleep전");

				sleep(1000);

				System.out.println(name + "스레드 1초 sleep후");

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();
			}

		}

	}

	public MyThreadSleep() {

	}

	public MyThreadSleep(String name) {

		super(name);

	}

}