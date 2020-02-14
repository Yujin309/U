package use;
import methods.A;//A라는 클래스를 사용하겠다.(위치를 알려주는것) 

public class AUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A aRef=new A();
        
         aRef.intValueReturn();
         //호출갔다가 온 자리에 0이 들어감->휘발성으로 날아감. =휘발성 Value
        int returnValue=aRef.intValueReturn();
         //int 정수변수= 정수 int 값 0을 받았다. => 형변화 일어나지 x
        //return value 0을 가지고 있음. 
        
        System.out.println(returnValue);
        
       //System.out.println("==>" +  aRef.stringValueReurn(-111));
       //우선순위: 덧셈 (왼쪽에서 오른쪽으로 ) 
       aRef.noReturnValue();

       
       
	
	}

}
