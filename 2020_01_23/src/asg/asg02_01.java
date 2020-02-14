package asg;
/* 2. ★를 다음과 같이 출력한다
   2-1)  ★★★★★★
          ★★★★★
          ★★★★
          ★★★
          ★★
          ★
 * */
public class asg02_01 {

	public static void main(String[] args) {
		for(int i=0; i<6 ; i++ ) { 
			//for(int i=6; j>0 ; i-- );
			//for(int i=j; i>0 ; i--);
				//for(int i=1; i<=j ; i++);
			for(int j=0; j<6-i ; j++) 
				
				System.out.printf("★");
			
			System.out.println();
		}
		
	}

}
