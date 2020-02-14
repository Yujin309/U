package 과제Book;

import java.util.Scanner;

public class ch3_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("제휴발급 카드 조건 입니다.");

System.out.println("1.기존고객입니까?");
System.out.println(" Y ,  N" );

String a= sc.next();

if (a.equals("N")) {
System.out.println("카드 발급이 불가능 합니다.");
	
	
}else if (a.equals("Y")) {
	
System.out.println("연소득 5,000만원 이상 입니까?");	

String b= sc.next();


if (b.equals("Y")) {
	System.out.println("카드 발급이 가능합니다.");

	
}else if (b.equals("N")){
			System.out.println("신용등급 B이상입니까?.");		
			
	String c= sc.next();		

	if (c.equals("Y")) {
		System.out.println("카드 발급이 가능합니다.");

}if (a.equals("N")) {
	System.out.println("카드 발급이 불가능 합니다.");
	
}
	}
	}	
}}



	


