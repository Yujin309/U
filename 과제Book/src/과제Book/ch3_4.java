package ����Book;

import java.util.Scanner;

public class ch3_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("���޹߱� ī�� ���� �Դϴ�.");

System.out.println("1.�������Դϱ�?");
System.out.println(" Y ,  N" );

String a= sc.next();

if (a.equals("N")) {
System.out.println("ī�� �߱��� �Ұ��� �մϴ�.");
	
	
}else if (a.equals("Y")) {
	
System.out.println("���ҵ� 5,000���� �̻� �Դϱ�?");	

String b= sc.next();


if (b.equals("Y")) {
	System.out.println("ī�� �߱��� �����մϴ�.");

	
}else if (b.equals("N")){
			System.out.println("�ſ��� B�̻��Դϱ�?.");		
			
	String c= sc.next();		

	if (c.equals("Y")) {
		System.out.println("ī�� �߱��� �����մϴ�.");

}if (a.equals("N")) {
	System.out.println("ī�� �߱��� �Ұ��� �մϴ�.");
	
}
	}
	}	
}}



	


