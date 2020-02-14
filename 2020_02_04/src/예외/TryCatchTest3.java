package 예외;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest3 {
	public int method() {
		Scanner conInput = new Scanner(System.in);
		// stat final 하기 때문에 in가능
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
			return res;// 리턴하라고 입력. 하지만 finally는 여전히 실행

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0이 아닌 수치 입력");
			return -1;

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("정수값을 입력하라 ");
			return -2;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("예측할수 없는 예외사항");
			return -3;
		} finally {
			System.out.println("약방의 감초");// 빠져나가게 뒷정리?하게 하는 것.

		}
		// System.out.println("end");//에러: 더이상 실행할것이 없기 때문
		// return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//method();//인스턴스가 있어야 호출이 되기 때문에 오류
		TryCatchTest3 test3 = new TryCatchTest3();
		System.out.println("return value" + test3.method());

	}
}