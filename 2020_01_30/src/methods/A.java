package methods;
/**
 * method�� return type�� ���� ���� 
 * @author bitcamp
 *
 */
public class A {
public void noReturnValue() {
	System.out.println("noReturnValue()");
}
 public int intValueReturn( ) {
int i= 9; 
	 if (i>10)return 1;
	 /*else*/ return 0;
	 //���� ������  return (i>10)? 1:0;

}
 public String stringValueReturn(int num) {
	 return(num>=0)? "���" :null ;  
//����� �ƴϸ� null 
 }
}
