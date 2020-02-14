package 과제Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class 과제0213 {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {

		File file = new File("D:/java_data/1234.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8" ));
		String line = null;
		
		try {
			if ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
