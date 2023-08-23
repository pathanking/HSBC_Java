package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("G://abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			if (fos != null)
				fos.write("Have a great evening!!".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("success!");

		try {
			if (fos != null)
				fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
