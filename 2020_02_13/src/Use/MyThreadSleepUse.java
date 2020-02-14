package Use;

import ½º·¹µå.MyThreadSleep;

public class MyThreadSleepUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread  thread = new MyThreadSleep("#1");
		Thread  thread2 = new MyThreadSleep("#2");
		Thread  thread3 = new MyThreadSleep("#3");
		thread.start();
		thread2.start();
		thread3.start();
	}

}