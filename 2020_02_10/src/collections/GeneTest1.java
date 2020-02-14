package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GeneTest1 {

	public static void main(String[] args) {
		List<String> ss = new ArrayList<String>();
		List<Date> ss3 = new ArrayList<Date>();
		List ss2 = new ArrayList();
		ss.add("1231231243");
		ss.add("dfkjdasklfjlaef");
		ss2.add(123);
		ss2.add(new Date());
		ss2.add("adfas00");
		ss2.add(new Test1());

		ss3.add(new Date());
		ss3.add(new Date(1992, 9, 9));
		ss3.add(new Date(1952, 4, 9));
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ss.size(); i++) {
			sb.append(ss.get(i));
		}
		System.out.println(sb);
		Date[] dates = new Date[10];
		Object obj;
		for (int i = 0; i < ss.size(); i++) {
			obj = ss2.get(i);
			if (obj instanceof Date)
				dates[i] = (Date) obj;
		}
		System.out.println(dates[0]);

		for (int i = 0; i < ss3.size(); i++) {
			dates[i] = ss3.get(i);
		
		}
		System.out.println(dates[0]);

	}

}
