package methods;
/**
 * Perameter�� ���� ���� 
 * 
 * @return : �Ű� ���� �ΰ��� ���� ���� 
 * call bt vaule 
 * sum()
 * �ߺ�, overloading 
 * 
 * call by reference
 */
public class B {
public int sum( int num1,int num2 ) { 
	//          =bRef.sum(90,100)
	return num1+num2;
	
}
 //@return : �Ű� ���� ������ ���� ���� 

public double  sum( double num1, double  num2 ) { 
	//          =bRef.sum(90,100)
	/**call by value ; sum�޼ҵ带 call�Ҷ� value�� �ش�. 
	 * sum���忡�� ������, (main method�� ��������  value�� �־����� �ڷᰡ �ٲ��� ���� . 
	 */
	//�޸� �� 3��° ������ ������� 
	System.out.println("sum() :" + num1+ "" +num2 );
	num1*= 10;
	
	System.out.println("sum() :" + num1+ "" +num2 );
	return num1+num2;
	
}
	
	

}
