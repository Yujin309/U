package ������;



import java.util.Scanner;



/**

 * �󸶸� ����? ������� ������ 

 * ����ó�� �޼ҵ�

 * @author bitcamp

 *

 */

public class ATMSample implements Runnable {

	private  int balance= 1000000;

	private String custName;

	private Scanner  input = new Scanner(System.in); 

	/**

	 * howMuch : ��ݾ�

	 * ��ݾ��� �ܾװ� �� �ؼ� �����ϸ� balance���� ���ش�

	 * �ܾ��� �����ϸ� �޼��� ���

	 */

	synchronized  private  void  withDraw(int howMuch) {

		if(balance  >= howMuch) {

			// ������� ���� 

			balance -= howMuch;

			// �ܾ��� �� ���Ҵ��� ���

			System.out.println(custName+"�� "+

					howMuch+"�� �����ؼ� "+balance+"�� ���ҽ��ϴ�");

		}else {

			// �ܾ��� ����

			System.err.println(custName+"�� "+

					"�ܾ��� "+balance+", ã�� �ݾ� :"+howMuch+"�ܾ��� �����մϴ�");

		}

	}

	/**

	 * ������ �󸶸� ������ ������ ���� , �ݾ� �������ְ�

	 * ������ ������ ��� �ݺ� , �ܾ��� 0�� �ɶ� ����

	 */

	@Override

	public void run() {

		

		while( balance > 0 ) {

			synchronized (this) {

				try {

					custName= Thread.currentThread().getName();

					System.out.println(custName+"�� ���� �ܾ��� "+balance);

					System.out.print(custName+"�� �󸶸� �����ҷ�?");

					withDraw(input.nextInt());

					wait();

				} catch (InterruptedException e) {

					// TODO Auto-generated catch block

					e.printStackTrace();

				}

			}

				

		}



	}



}





























 

