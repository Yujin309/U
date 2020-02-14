package 교재;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch3_4 {
	private int  annualIncome; // 연소득 0
	private char creditRating; // 신용등급 0
	private boolean isMember; // 기존고객 false
	private String issuanceStatus;// 발급 상태 null

	private BufferedReader reader;
	
	public ch3_4() {

		reader = new BufferedReader(new InputStreamReader(System.in)// reader화 시킴.

		);

	}

	public void consolInput() {
		try {
			System.out.println("연소득 ?");
			 annualIncome = Integer.parseInt(reader.readLine());
		
			System.out.println("A,B,C,D,F중에 입력하세요.");
			System.out.print("신용등급?");

			String s = reader.readLine();
			if (s.length() == 1 && // 1이여야 하고
					s.equalsIgnoreCase("A") || s.equalsIgnoreCase("B") || s.equalsIgnoreCase("C")
					|| s.equalsIgnoreCase("D") || s.equalsIgnoreCase("F")) {
				creditRating = s.toUpperCase().charAt(0);
			} else {
				reInput("A,B,C,D,F중에 입력하세요.");

			}

			// char화 시켜야함

			System.out.println("기존고객은 T 신규고객은 F");
	
			System.out.print("기존고객인가요?");
			s = reader.readLine();
			if (s.length() == 1 && s.equalsIgnoreCase("T") || s.equalsIgnoreCase("F")) {
				isMember = Boolean.valueOf(s);
			isMember=true;
			}else {

				reInput("기존고객은 T,신규고객은 F");

			}
			membershipCondition();

		} catch (IOException e) {

			System.out.println("입력을 받아서 exception이 풀림");

		} catch (NumberFormatException e) {

			// TODO: handle exception
			reInput("숫자를 입력하세요.");
		} catch (Exception e) {
			reInput("예상하지 못한 예외");

		}

	}

	private void reInput(String msg) {
		System.out.println(msg);
		consolInput();

	}

	protected void membershipCondition() {
if ( annualIncome>= 50000000 || creditRating<='B') {
	if(isMember)issuanceStatus="발급대상";
	
	
	}else issuanceStatus="발급대상제외";

	
}

public void consolOutput() {//콘솔은 키보드 이거나 모니터 이다. 
System.out.println("연소득 신용등급 기존 고객 발급상태");
System.out.printf("%, 12d% 5c 8b% 10s\n ",
		 annualIncome,creditRating,issuanceStatus);
	
	}

}
