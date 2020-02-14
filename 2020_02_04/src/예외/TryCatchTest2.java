package 예외;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner conInput = new Scanner(System.in);
//stat final 하기 때문에 in가능
		int num1 = 0;// 초기화 시켜줌
		int num2 = 0;
		int res = 0;
		try {
			System.out.print("수1: ");
			num1 = conInput.nextInt();
			System.out.print("수2: ");
			num2 = conInput.nextInt();

			res = num1 / num2;

			System.out.println(num1 + "/" + num2 + "=" + res);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0이 아닌 수치 입력");
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("정수값을 입력하라 ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("예측할수 없는 예외사항");

		} finally {
			System.out.println("약방의 감초");

		}
		System.out.println("end");
	}
}