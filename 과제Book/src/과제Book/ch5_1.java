package ����Book;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ch5_1 {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		/**System.out.println("���ڸ� �Է����ּ���.");
Scanner a =new Scanner(System.in); 
String b= a.nextLine();
//System.out.println(b+ "�� �ƽ�Ű�ڵ�� "+b.hashCode() +"�Դϴ�");

8*/
		System.out.println("���ڸ� �Է����ּ���.");
		Scanner a =new Scanner(System.in);
		String b= a.nextLine();
		System.out.println(b+ "�� �ƽ�Ű�ڵ�� "+b.hashCode() +"�Դϴ�");
/**File file=new File("output.txt");
FileOutputStream fos=new FileOutputStream(file);
PrintStream ps= new PrintStream(fos);
System.setOut(ps);*/
}
}
	


