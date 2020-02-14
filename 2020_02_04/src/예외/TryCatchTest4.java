
package 예외;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest4 {
	
	//private int num1;
	private int num1;
	private int num2;
	private int add;
	private int subt;
	private int multip;
	private int div;

	Scanner conInput = new Scanner(System.in);

	// 입력
	public void input() {
		System.out.print("수1: ");
		num1 = conInput.nextInt();
		System.out.print("수2: ");
		num2 = conInput.nextInt();

//연산

	}

	public void calc() {
		add = num1 + num2;
		subt = num1 - num2;
		multip = num1 * num2;
		div = num1 / num2;

	}

	// 결과 출력
	public void resOutput() {
		System.out.println(num1 + " + " + num2 + " = " + add);

		System.out.println(num1 + " - " + num2 + " = " + subt);

		System.out.println(num1 + " * " + num2 + " = " + multip);

		System.out.println(num1 + " / " + num2 + " = " + div);

	}

}
