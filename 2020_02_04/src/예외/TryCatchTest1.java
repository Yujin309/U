package ����;

//import java.io.InputStream;
import java.util.Scanner;

public class TryCatchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner conInput = new Scanner(System.in);
//stat final �ϱ� ������ in����

		System.out.print("��1: ");
		int num1 = conInput.nextInt();

		System.out.print("��2: ");
		int num2 = conInput.nextInt();

		int res = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + res);
	}

}
