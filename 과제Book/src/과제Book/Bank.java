package 과제Book;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("이름? ");
			String name=sc.nextLine();
			
			System.out.print("몇년? ");
			int year=sc.nextInt() * Util.MONTH_YEAR;
			
			System.out.println("월입금액? ");
			int month=sc.nextInt();
			
			int principal = month * Util.MONTH_YEAR;
			int total=(int)(principal*Saving.getRate());
			
			//System.out.println("원금==> 월 %6d 원 x %d 개월 = %d 원\n",month,year,month*year);
			System.out.printf("원금==> 월 %6d 원 x %d 개월 = %d 원\n",month,year,month*year);
			System.out.printf("만기시 금액==> 이율 : %d => %d + %d *%.2f = %d원\n",(int)(Saving.getRate()*100),principal, principal, Saving.getRate(),total);
			System.out.println("가입하시겠습니까?");
			
			
			char ans=sc.next().charAt(0);
			String ansStr=sc.nextLine()	;
			
			if(ansStr.equalsIgnoreCase("y"))
				if(ansStr.equals("y")|| ansStr.equals("Y")){
	
				}
			if(ans=='Y') {
				System.out.println("\n계좌생성\n");
				Saving people = new Saving(name,year,month);
				//people.output();
				sc.nextLine();
				
			}else if(ans=='N') {
					System.out.println("감사합니다");
					break;
				}else {
					System.out.println("잘못된 입력");
					break;
			}
				Saving people = new Saving(name,year,month);
				people.output();
				sc.nextLine();
			}
		}
	}