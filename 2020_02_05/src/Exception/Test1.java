package Exception;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStream stream=System.in;
System.out.println("�Է�");
//stream: ������ ������ �� 
int data= stream.read();
System.out.println("�Է¹��� ������"+data);

	}

}
