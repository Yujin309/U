package use;

import methods.B;

public class BUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 B bRef = new B();
/**B타입의 레퍼런스 임
int num1 =90;
int num2 = 100;
int resSum =bRef.sum(num1, num2); 
	          //bRef.sum( 90 , 100 ); ->sum실행 (B의 SUM)
	B bRef= new b();

 System.out.println(num1+""+num2+""+resSum);*/
 
double num1=9.9; //1은 메소드 안에
double num2=10;

	System.out.println( bRef.sum (num1,num2) );
	//call by value 방식 
	System.out.println( num1 + "" + num2);
	
	}
}
