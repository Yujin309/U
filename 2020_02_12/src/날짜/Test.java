package ��¥;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2020;

		/**
		 * 1. ���ǽ����� ��� ���� �������� ����غ��� 2020���� �����Դϴ�. �̷��� ������ 2.�׷���Į������ �̿��ؼ� �������� ������� ���
		 */

		GregorianCalendar cal2 = new GregorianCalendar();
		int i = cal2.get(Calendar.YEAR);

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

			System.out.println("%���� �����Դϴ�.");
		}
		if (cal2.isLeapYear(i)) {

			System.out.println(year + "���� �����Դϴ�.");
		}

	}
}
