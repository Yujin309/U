package ������;

import java.util.ArrayList;
import java.util.List;
import ������.ATMSample;
public class Test2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable target = new ATMSample();
List<Thread> thread= new ArrayList<Thread>();
thread.add(new Thread(target,"����"));
thread.add(new Thread(target,"�ƺ�"));
thread.add(new Thread(target,"�Ƶ�"));
thread.add(new Thread(target,"��"));


for(Thread t : thread) {

	t.start();
	package use;



	import java.util.ArrayList;

	import java.util.List;



	import ������.ATMSample;



	public class ATMUse {



		public static void main(String[] args) {

			// TODO Auto-generated method stub

			Runnable  target  =  new ATMSample();

			List<Thread> threads = new ArrayList<Thread>();

			threads.add(new Thread(target, "����"));

			threads.add(new Thread(target, "�ƺ�"));

			threads.add(new Thread(target, "�Ƶ�"));

			threads.add(new Thread(target, "����"));

			

			for(Thread t : threads) {

				t.start();

			}

		}



	}










}

}



}



