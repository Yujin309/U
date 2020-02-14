package ����;

import java.util.InputMismatchException;

import java.util.Scanner;

public class TryCatchTest7 {

	private int num1;

	private int num2;

	private int add;

	private int subt;

	private int multip;

	private int div;

	private Scanner conInput = new Scanner(System.in);

	private String msg;

	// �Է� ( )

	public void input2() {

		num1 = input("��1");
		input3();
	}

	public void input3() {
		num2 = input("��2");
		calc();
	}

	int temp = 0;
//String str:�Ű����� /�Ķ����
	public int input(String str) {
		try {

			System.out.print(str);

			return temp = conInput.nextInt();

		} catch (InputMismatchException e) {

			msg = " ���� ������ �Է� , �Ҽ��� ���ϴ� �Է� ���� ������. ";

		} catch (Exception e) {
			msg = " �˼����� ���� �߻� , ��ġ�Է� ";
		}
		conInput.nextLine();

		System.out.println(msg);

		return input(str);

	}

	public void calc() {

		add = num1 + num2;

		subt = num1 - num2;

		multip = num1 * num2;

		try {
			div = num1 / num2;

		} catch (ArithmeticException e) {
			msg = "0�̿��� ���ڸ� �Է��ϼ���.";
			System.out.println(msg);
			conInput.nextLine();
			input3();
			return;
		}
		conInput.nextLine();

		System.out.println(msg);
	}

	// ��� ���

	public void resOutput() {

		System.out.println(num1 + " + " + num2 + " = " + add);

		System.out.println(num1 + " - " + num2 + " = " + subt);

		System.out.println(num1 + " * " + num2 + " = " + multip);

		System.out.println(num1 + " / " + num2 + " = " + div);

	}

}
