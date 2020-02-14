package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {

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
				try {
					fileReader = new FileReader(txFile);

					int data = fileReader.read();
					while (data != -1) {

						System.out.println((char) data);
						data = fileReader.read();
					}
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
