package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//D:\javadata\1234.txt

		String pathname = "D:/javadata/1234.txt";
		File txFile = new File(pathname);
		if (txFile.exists()) {
			System.out.println("파일 존재");
			if (txFile.isFile()) {
				System.out.println("file");
				FileReader fileReader = null;
				BufferedReader reader = null;
				try {
					fileReader = new FileReader(txFile);
					reader = new BufferedReader(fileReader);
					int data = -1;
					while ((data = fileReader.read()) != -1) {
						System.out.print((char) data);
					}
					/**
					 * String dataStr = null; while ((dataStr = reader.readLine()) != null) {
					 * System.out.println(dataStr); }
					
			*/
					
					String dataStr=null;
				
					
					
					

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (fileReader != null) {
						fileReader.close();

					}
				}
			} else {
				System.out.println("folder");
			}
		} else {
			System.out.println("존재하지 않음");
		}

	}

}
