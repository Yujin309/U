package fileIO;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ReadTest5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//D:\java_data\1234.txt  �ѱ۱��� ����
		String pathname="D:/1234.txt";
		String pathname2="D:/987.txt";
		
		File  txtFile = new File(pathname);
		BufferedReader  reader=new BufferedReader(
				new InputStreamReader( 
					new FileInputStream(txtFile)	, "utf-8")
				);
		PrintStream out=new PrintStream(pathname2);
		String str;
		while(  ( str=reader.readLine() ) !=null   ) {
			System.out.println(str);
		}
		
		reader.close();
		out.close();
	}

}