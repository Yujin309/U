package Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
//import com.sun.java_cup.internal.runtime.Scanner;
//import com.sun.java_cup.internal.runtime.Symbol;

public class Ch9Ex3 {
	HashMap<String, ArrayList<String>> productdb;
//������

	public Ch9Ex3() {
		productdb = new HashMap<String, ArrayList<String>>();
//��ǰ���
		ArrayList<String> plist1 = new ArrayList<String>();
		ArrayList<String> plist2 = new ArrayList<String>();
		ArrayList<String> plist3 = new ArrayList<String>();

		plist1.addAll(Arrays.asList("����Ʈ TV", "������S7", "��Ʈ20.1"));
		productdb.put("�Ｚ", plist1);

		plist1.addAll(Arrays.asList("Ŀ���TV", "��Ƽ����G10", "�ÿ�������2"));
		productdb.put("����", plist2);
		plist1.addAll(Arrays.asList("���� TV", "������7s", "�����е�����"));
		productdb.put("����", plist3);

	}

	void search() {
		System.out.println("##��ǰ�˻�##");
		System.out.print("##������ �Է� : ");
		Scanner scan = new Scanner(System.in);

		String p = scan.next();

		ArrayList<String> result = (ArrayList<String>) productdb.get(p);
		if (result != null) {
			for (String s : result) {
				System.out.println(s);
			}

		} else {
			System.out.println("�˻������ �����ϴ�");
		}scan.close();
	}

	public static void main(String[] args) {
		Ch9Ex3 app = new Ch9Ex3();
		app.search();
	}
}
