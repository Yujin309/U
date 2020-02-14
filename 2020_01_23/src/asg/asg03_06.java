package asg;
/**
 *3-6) 구구단을 출력하세요
  2단              3단            4단            ~~~~  9단
2 x 1 = 2    3 x 1 = 3   4 x 1 = 4                 9 x 1 = 9
    ~
    ~
2 x 9 = 18 3 x 9 = 27  4 x 9 = 36             9 x 9 = 81 
 *
 */
public class asg03_06 {

	public static void main(String[] args) {
		for(int i = 2; i <=9; i ++ ) {
			System.out.print("  "+i+"단\t");
		}
			System.out.println();
			for(int i = 1 ; i <=9 ; i ++) {
				for(int j= 2 ; j <= 9 ; j++) {
					  System.out.print(j+"x"+i+"="+ j*i + "\t");
					  
				}
				System.out.println();
		}
		
			
		
	}

}
