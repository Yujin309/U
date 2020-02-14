package Hw1;

public class waitSystem {
	
	static int number;
	
	public void later() {
		int i = 0;
		char a = 64;
		for(char laters = 1;laters<=number; laters++) {
			a++;
			System.out.print(a+"는 현재 ");
			i++;
			System.out.println("대기인원은 "+number+"명 중 "+i+"번째");
		}
		
	}
	
}
