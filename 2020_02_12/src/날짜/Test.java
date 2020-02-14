package 날짜;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2020;

		/**
		 * 1. 조건식으로 평년 인지 윤년인지 출력해보기 2020년은 윤년입니다. 이렇게 나오게 2.그레고리칼린더를 이용해서 윤년인지 평년인지 출력
		 */

		GregorianCalendar cal2 = new GregorianCalendar();
		int i = cal2.get(Calendar.YEAR);

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

			System.out.println("%년은 윤년입니다.");
		}
		if (cal2.isLeapYear(i)) {

			System.out.println(year + "년은 윤년입니다.");
		}

	}
}
