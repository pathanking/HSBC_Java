package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("xyz.txt");

		int data;

		while ((data = fis.read()) != -1) {  //reading from abc.txt
			fos.write(data);  		//writing into xyz.txt
		}
	}
}
