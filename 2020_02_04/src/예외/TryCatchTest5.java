package 예외;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatchTest5 {
	private int num1;
	private int num2;
	private int add;
	private int subt;
	private int multip;
	private int div; //이셉션 넣어서 해결해보기 = 0을 넣었을때 
	
	private Scanner conInput = new Scanner(System.in);
	private String msg;
	//입력
	public void  input(){
	try {
		System.out.print("수1: "); 
		num1=conInput.nextInt();
		//conInput.nextInt(); 이셉션이 발생하면 나머지 문장 처리 x 
		//conInput.next();
		
		System.out.print("수2: "); 
		num2=conInput.nextInt();//exc이 발생하면 실행x
		
		//conInput.nextLine()	;
        calc();
		return;
//연산
	}catch (InputMismatchException e) {
	 msg= ("수는 정수로 입력, 소숫점  이하는 입력하지 마세요 "); 
 } catch (Exception e) {
	msg=("알수 없는 예외 발생 ,수치입력");
 }
	System.out.println(msg);
	 input();
	 }
public void calc() {
	add=num1+num2;
	subt=num1-num2;
multip=num1*num2;
div=num1/num2;
}
	//결과 출력 
public void resOutput() {
	System.out.println(num1 + " + "+ num2 +" = "+ add);

	System.out.println(num1 + " - "+ num2 +" = "+ subt);

	System.out.println(num1 + " * "+ num2 +" = "+ multip);

	System.out.println(num1 + " / "+ num2 +" = "+ div);
	
	
	
}
}