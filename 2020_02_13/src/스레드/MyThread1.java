package 스레드;

public class MyThread1 extends Thread{
	
public MyThread1(String treadName) {
	// TODO Auto-generated constructor stub
super(treadName);
}
@Override
public void run() {
System.out.println("현재 스레드의 이름 ::"+currentThread());

	
}
//	public static void main(String[] args) {

//스레드로 부터 파생된 클래스 







}
