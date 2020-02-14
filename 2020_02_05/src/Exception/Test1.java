package Exception;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStream stream=System.in;
System.out.println("입력");
//stream: 논리적인 데이터 길 
int data= stream.read();
System.out.println("입력받은 데이터"+data);

	}

}
