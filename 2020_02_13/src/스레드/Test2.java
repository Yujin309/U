package 스레드;

import java.util.ArrayList;
import java.util.List;
import 스레드.ATMSample;
public class Test2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable target = new ATMSample();
List<Thread> thread= new ArrayList<Thread>();
thread.add(new Thread(target,"엄마"));
thread.add(new Thread(target,"아빠"));
thread.add(new Thread(target,"아들"));
thread.add(new Thread(target,"딸"));


for(Thread t : thread) {

	t.start();
	package use;



	import java.util.ArrayList;

	import java.util.List;



	import 스레드.ATMSample;



	public class ATMUse {



		public static void main(String[] args) {

			// TODO Auto-generated method stub

			Runnable  target  =  new ATMSample();

			List<Thread> threads = new ArrayList<Thread>();

			threads.add(new Thread(target, "엄마"));

			threads.add(new Thread(target, "아빠"));

			threads.add(new Thread(target, "아들"));

			threads.add(new Thread(target, "손자"));

			

			for(Thread t : threads) {

				t.start();

			}

		}



	}










}

}



}



