package 반복문;
/**10번 반복
★★★★★★★★★★
 * 
 * @param args
 */
public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int count =0    ; count <10 ;count++   ) {  //++count해도 상관 없음 ∵ 세미콜론
			System.out.print('★');
		}
		System.out.println();
		for (int count =1    ; count <=10 ;count++   ) {  
			System.out.print('★');
		}
		System.out.println();
		for (int count =1    ; count <11 ;count++   ) {  
		System.out.print('★');
		}
		System.out.println();
		for (int count =10    ; count > 0 ;count--   ) {  
			System.out.print('★');

		}			
				
	}

}
