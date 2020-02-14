
package 스레드;

import java.util.Scanner;

/**

 * 얼마를 인출? 인출금을 가지고 

 * 인출처리 메소드
 */

public class ATM implements Runnable {

	private  int balance= 1000000;

	private String custName;

	private Scanner  input = new Scanner(System.in); 

	/**

	 * howMuch : 출금액

	 * 출금액을 잔액과 비교 해서 가능하면 balance에서 빼준다

	 * 잔액이 부족하면 메세지 출력

	 */

	private  void  withDraw(int howMuch) {

		if(balance  >= howMuch) {

			// 인출금을 빼고 

			balance -= howMuch;

			// 잔액이 얼마 남았는지 출력

			System.out.println(custName+"님 "+

					howMuch+"을 인출해서 "+balance+"원 남았습니다");

		}else {

			// 잔액이 부족

			System.err.println(custName+"님 "+

					"잔액은 "+balance+", 찾을 금액 :"+howMuch+"잔액이 부족합니다");}

	}

	/**

	 * 고객에게 얼마를 인출할 것인지 묻고 , 금액 인출해주고

	 * 스레드 고객마다 계속 반복 , 잔액이 0이 될때 까지

	 */

	@Override

	public void run() {

		while( balance > 0 ) {

			custName= Thread.currentThread().getName();

			System.out.println(custName+"님 현재 잔액은 "+balance);

			System.out.print(custName+"님 얼마를 인출할래?");

			withDraw(input.nextInt());

		}
}


}


