package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch3_4 {
	private int  annualIncome; // ���ҵ� 0
	private char creditRating; // �ſ��� 0
	private boolean isMember; // ������ false
	private String issuanceStatus;// �߱� ���� null

	private BufferedReader reader;
	
	public ch3_4() {

		reader = new BufferedReader(new InputStreamReader(System.in)// readerȭ ��Ŵ.

		);

	}

	public void consolInput() {
		try {
			System.out.println("���ҵ� ?");
			 annualIncome = Integer.parseInt(reader.readLine());
		
			System.out.println("A,B,C,D,F�߿� �Է��ϼ���.");
			System.out.print("�ſ���?");

			String s = reader.readLine();
			if (s.length() == 1 && // 1�̿��� �ϰ�
					s.equalsIgnoreCase("A") || s.equalsIgnoreCase("B") || s.equalsIgnoreCase("C")
					|| s.equalsIgnoreCase("D") || s.equalsIgnoreCase("F")) {
				creditRating = s.toUpperCase().charAt(0);
			} else {
				reInput("A,B,C,D,F�߿� �Է��ϼ���.");

			}

			// charȭ ���Ѿ���

			System.out.println("�������� T �ű԰��� F");
	
			System.out.print("�������ΰ���?");
			s = reader.readLine();
			if (s.length() == 1 && s.equalsIgnoreCase("T") || s.equalsIgnoreCase("F")) {
				isMember = Boolean.valueOf(s);
			isMember=true;
			}else {

				reInput("�������� T,�ű԰��� F");

			}
			membershipCondition();

		} catch (IOException e) {

			System.out.println("�Է��� �޾Ƽ� exception�� Ǯ��");

		} catch (NumberFormatException e) {

			// TODO: handle exception
			reInput("���ڸ� �Է��ϼ���.");
		} catch (Exception e) {
			reInput("�������� ���� ����");

		}

	}

	private void reInput(String msg) {
		System.out.println(msg);
		consolInput();

	}

	protected void membershipCondition() {
if ( annualIncome>= 50000000 || creditRating<='B') {
	if(isMember)issuanceStatus="�߱޴��";
	
	
	}else issuanceStatus="�߱޴������";

	
}

public void consolOutput() {//�ܼ��� Ű���� �̰ų� ����� �̴�. 
System.out.println("���ҵ� �ſ��� ���� �� �߱޻���");
System.out.printf("%, 12d% 5c 8b% 10s\n ",
		 annualIncome,creditRating,issuanceStatus);
	
	}

}
