package ����;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest3 {
	public int method() {
		Scanner conInput = new Scanner(System.in);
		// stat final �ϱ� ������ in����
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
			return res;// �����϶�� �Է�. ������ finally�� ������ ����

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0�� �ƴ� ��ġ �Է�");
			return -1;

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("�������� �Է��϶� ");
			return -2;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("�����Ҽ� ���� ���ܻ���");
			return -3;
		} finally {
			System.out.println("����� ����");// ���������� ������?�ϰ� �ϴ� ��.

		}
		// System.out.println("end");//����: ���̻� �����Ұ��� ���� ����
		// return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//method();//�ν��Ͻ��� �־�� ȣ���� �Ǳ� ������ ����
		TryCatchTest3 test3 = new TryCatchTest3();
		System.out.println("return value" + test3.method());

	}
}