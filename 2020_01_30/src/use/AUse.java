package use;
import methods.A;//A��� Ŭ������ ����ϰڴ�.(��ġ�� �˷��ִ°�) 

public class AUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A aRef=new A();
        
         aRef.intValueReturn();
         //ȣ�Ⱜ�ٰ� �� �ڸ��� 0�� ��->�ֹ߼����� ���ư�. =�ֹ߼� Value
        int returnValue=aRef.intValueReturn();
         //int ��������= ���� int �� 0�� �޾Ҵ�. => ����ȭ �Ͼ�� x
        //return value 0�� ������ ����. 
        
        System.out.println(returnValue);
        
       //System.out.println("==>" +  aRef.stringValueReurn(-111));
       //�켱����: ���� (���ʿ��� ���������� ) 
       aRef.noReturnValue();

       
       
	
	}

}
