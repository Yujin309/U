package ����;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++) {

			System.out.println(Math.random());
		}
		System.out.println("?????????????");
		for (int i = 1; i < 100; i++) {
			System.out.println((int) Math.random() * 10+1);
		}
		System.out.println(Math.random());
		System.out.println(Math.round(5.4));
		System.out.println(Math.rint(5.6));
		System.out.println(Math.rint(5.4));
		System.out.println(Math.ceil(5.6)); // 5.4�� 5.00001�̴����� ��¶��
		System.out.println(Math.ceil(5.6));
		System.out.println(Math.floor(5.6));// �ٴ� 5.999���������
		System.out.println(Math.floor(5.4));

		Random random = new Random();
		for (int i = 1; i < 5; i++) {
			random.nextInt(10);
			System.out.println(random.nextInt(10));
		}
	}

}// 1���� 10���� �������?
