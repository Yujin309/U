package methods;
/**
 * Perameter에 대한 예제 
 * 
 * @return : 매개 변수 두개의 합을 리턴 
 * call bt vaule 
 * sum()
 * 중복, overloading 
 * 
 * call by reference
 */
public class B {
public int sum( int num1,int num2 ) { 
	//          =bRef.sum(90,100)
	return num1+num2;
	
}
 //@return : 매개 변수 세개의 합을 리턴 

public double  sum( double num1, double  num2 ) { 
	//          =bRef.sum(90,100)
	/**call by value ; sum메소드를 call할때 value를 준다. 
	 * sum입장에서 봤을때, (main method의 원격지에  value를 넣었을때 자료가 바뀌지 않음 . 
	 */
	//메모리 상에 3번째 변수가 만들어짐 
	System.out.println("sum() :" + num1+ "" +num2 );
	num1*= 10;
	
	System.out.println("sum() :" + num1+ "" +num2 );
	return num1+num2;
	
}
	
	

}
