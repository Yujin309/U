package Á¤¸®;
import java.util.ArrayList;
import java.util.List;

public class OverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA ref = new AA();
		SubAA  ref2 = new SubAA();
		ref.m1();// AA
		ref2.m1();//SubAA
		
		AA refX= new SubAA();
		refX.m1();
		refX= new AA();
		refX.m1();
		refX= new AA();
		refX.m1();
		
		List  refff= new ArrayList();
		refff.add("dfsdfs");
		//refff= new List();
		
		
	}

}


