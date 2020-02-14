package asg;

public class asg03_09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=4;
		//int fac=num;
		
		for(int num=5, fac=num ;num>1 ; num--) {
			fac *= num-1 ;
			System.out.println(num + " " + fac);
		}

	}

}
