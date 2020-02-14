package asg;
/**
 * 3-1) 다음과 같이 출력하세요
  1    2   3    4   5 
  6   7   8    9   10 
 11  12  13  14  15
 */
public class asg03_01 {

	public static void main(String[] args) {
		for(int i=0 ;i<3 ;i++ ) {
			for(int j=1;j<6;j++) {	
			 /**for(int i=1; i<16; i++) {
			System.out.printf("%5d",i);
			if(i%5==0) {
				System.out.println("");
			}
			  * 
			  */
				System.out.print(5*i+j +" ");
			}
			System.out.println("  ");
		}
	}

}
