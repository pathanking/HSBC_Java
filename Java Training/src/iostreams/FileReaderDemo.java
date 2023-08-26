package iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileReader reader = new FileReader("demo.txt"); 
				Scanner scanner = new Scanner(reader);) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
	}
}