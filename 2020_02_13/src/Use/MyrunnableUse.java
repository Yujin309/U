package Use;

import 실행할Run을가지고있는.Myrunnable;

public class MyrunnableUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Runnable target= new Myrunnable();	
		Thread thread=new Thread(target,"#1");
		
		thread.start();
		
		Thread thread2=new Thread(target,"#2");
		thread2.start();
System.out.println(thread.currentThread());
	}

}
