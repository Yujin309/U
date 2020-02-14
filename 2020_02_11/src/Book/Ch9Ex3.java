package Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
//import com.sun.java_cup.internal.runtime.Scanner;
//import com.sun.java_cup.internal.runtime.Symbol;

public class Ch9Ex3 {
	HashMap<String, ArrayList<String>> productdb;
//생성자

	public Ch9Ex3() {
		productdb = new HashMap<String, ArrayList<String>>();
//제품등록
		ArrayList<String> plist1 = new ArrayList<String>();
		ArrayList<String> plist2 = new ArrayList<String>();
		ArrayList<String> plist3 = new ArrayList<String>();

		plist1.addAll(Arrays.asList("스마트 TV", "갤럭시S7", "노트20.1"));
		productdb.put("삼성", plist1);

		plist1.addAll(Arrays.asList("커브드TV", "옵티무스G10", "시원에어컨2"));
		productdb.put("엘지", plist2);
		plist1.addAll(Arrays.asList("애플 TV", "아이폰7s", "아이패드프로"));
		productdb.put("애플", plist3);

	}

	void search() {
		System.out.println("##상품검색##");
		System.out.print("##제조사 입력 : ");
		Scanner scan = new Scanner(System.in);

		String p = scan.next();

		ArrayList<String> result = (ArrayList<String>) productdb.get(p);
		if (result != null) {
			for (String s : result) {
				System.out.println(s);
			}

		} else {
			System.out.println("검색결과가 없습니다");
		}scan.close();
	}

	public static void main(String[] args) {
		Ch9Ex3 app = new Ch9Ex3();
		app.search();
	}
}
