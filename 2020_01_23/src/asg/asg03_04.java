package asg;

public class asg03_04 {
	public static void main(String[] args) {
		char alpha = 'A';
		char beta = 'a';
		
		for(int i=-1 ; i<=24 ; i++) {
			System.out.print(alpha++  +" ");
			if ((i+2)%6==0) {
				System.out.println();
			} 
		}
			System.out.println();
		for(int i=35 ; i<= 60; i++) {
			System.out.print(beta++ +" ");
			if ((i+2)%6==0) {
				System.out.println();
			}

		}
		
	}
		
}
