package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo5 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;

		fos = new FileOutputStream("abc.txt", true);
		System.out.println("Enter Content For File>>>");
		String content = new Scanner(System.in).nextLine();

		if (fos != null) {
			byte[] bytes = content.getBytes();
			System.out.println(bytes.length);
			fos.write(bytes);
		}

		System.out.println("success!");

		if (fos != null)
			fos.close();

	}
}
