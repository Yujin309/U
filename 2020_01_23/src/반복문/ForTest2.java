package 반복문;

public class ForTest2 {

	public static void main(String[] args) {
		for(int count=1 ;count <=3 ; ++count ) {
			System.out.print("★★★★");
			System.out.println("");	
		}
		System.out.println("//////////////");	
		for(int count=1 ;count <=3 ; ++count ) { //행
			for(int col=1 ; col <=4 ; col++ ) { //열
				System.out.print('★');			

				}
			System.out.println("");
	
		}


	} //main
} //for
