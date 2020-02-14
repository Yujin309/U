package ����;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner conInput = new Scanner(System.in);
//stat final �ϱ� ������ in����
		int num1 = 0;// �ʱ�ȭ ������
		int num2 = 0;
		int res = 0;
		try {
			System.out.print("��1: ");
			num1 = conInput.nextInt();
			System.out.print("��2: ");
			num2 = conInput.nextInt();

			res = num1 / num2;

			System.out.println(num1 + "/" + num2 + "=" + res);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0�� �ƴ� ��ġ �Է�");
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("�������� �Է��϶� ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("�����Ҽ� ���� ���ܻ���");

		} finally {
			System.out.println("����� ����");

		}
		System.out.println("end");
	}
}