package 예외;

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

	// 입력 ( )

	public void input2() {

		num1 = input("수1");
		input3();
	}

	public void input3() {
		num2 = input("수2");
		calc();
	}

	int temp = 0;
//String str:매개변수 /파라미터
	public int input(String str) {
		try {

			System.out.print(str);

			return temp = conInput.nextInt();

		} catch (InputMismatchException e) {

			msg = " 수는 정수로 입력 , 소숫점 이하는 입력 하지 마세요. ";

		} catch (Exception e) {
			msg = " 알수없는 예외 발생 , 수치입력 ";
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
			msg = "0이외의 숫자를 입력하세요.";
			System.out.println(msg);
			conInput.nextLine();
			input3();
			return;
		}
		conInput.nextLine();

		System.out.println(msg);
	}

	// 결과 출력

	public void resOutput() {

		System.out.println(num1 + " + " + num2 + " = " + add);

		System.out.println(num1 + " - " + num2 + " = " + subt);

		System.out.println(num1 + " * " + num2 + " = " + multip);

		System.out.println(num1 + " / " + num2 + " = " + div);

	}

}
