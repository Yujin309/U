package Book;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Ch7Ex7Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket s = new Socket("192.168.0.30",5959);
			System.out.println("##Ŭ���̾�Ʈ ����..");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.println("HI");
			pw.close();
			s.close();
			System.out.println("##Ŭ���̾�Ʈ ����");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
