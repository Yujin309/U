package 과제Book;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ch5_1 {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		/**System.out.println("문자를 입력해주세요.");
Scanner a =new Scanner(System.in); 
String b= a.nextLine();
//System.out.println(b+ "는 아스키코드로 "+b.hashCode() +"입니다");

8*/
		System.out.println("문자를 입력해주세요.");
		Scanner a =new Scanner(System.in);
		String b= a.nextLine();
		System.out.println(b+ "는 아스키코드로 "+b.hashCode() +"입니다");
/**File file=new File("output.txt");
FileOutputStream fos=new FileOutputStream(file);
PrintStream ps= new PrintStream(fos);
System.setOut(ps);*/
}
}
	


