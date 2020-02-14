package methods;
/**
 * method의 return type에 대한 예제 
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
	 //삼항 연산자  return (i>10)? 1:0;

}
 public String stringValueReturn(int num) {
	 return(num>=0)? "양수" :null ;  
//양수가 아니면 null 
 }
}
